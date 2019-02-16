package com.nscorp.cost.calculator.exception;

import java.util.Date;
import java.util.List;

public class ErrorDetails {
    private Date timestamp;
    private String status;
    private List<FieldError> errors;

    @java.beans.ConstructorProperties({"timestamp", "status", "errors"})
    ErrorDetails(Date timestamp, String status, List<FieldError> errors) {
        this.timestamp = timestamp;
        this.status = status;
        this.errors = errors;
    }

    public static ErrorDetailsBuilder builder() {
        return new ErrorDetailsBuilder();
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<FieldError> getErrors() {
        return this.errors;
    }

    public void setErrors(List<FieldError> errors) {
        this.errors = errors;
    }

    public static class ErrorDetailsBuilder {
        private Date timestamp;
        private String status;
        private List<FieldError> errors;

        ErrorDetailsBuilder() {
        }

        public ErrorDetails.ErrorDetailsBuilder timestamp(Date timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ErrorDetails.ErrorDetailsBuilder status(String status) {
            this.status = status;
            return this;
        }

        public ErrorDetails.ErrorDetailsBuilder errors(List<FieldError> errors) {
            this.errors = errors;
            return this;
        }

        public ErrorDetails build() {
            return new ErrorDetails(timestamp, status, errors);
        }

        public String toString() {
            return "ErrorDetails.ErrorDetailsBuilder(timestamp=" + this.timestamp + ", status=" + this.status + ", errors=" + this.errors + ")";
        }
    }
}