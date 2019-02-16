package com.nscorp.cost.calculator.exception;


public class FieldError {
    private String field;
    private String message;

    @java.beans.ConstructorProperties({"field", "message"})
    FieldError(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public static FieldErrorBuilder builder() {
        return new FieldErrorBuilder();
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class FieldErrorBuilder {
        private String field;
        private String defaultMessage;

        FieldErrorBuilder() {
        }

        public FieldErrorBuilder field(String field) {
            this.field = field;
            return this;
        }

        public FieldErrorBuilder defaultMessage(String defaultMessage) {
            this.defaultMessage = defaultMessage;
            return this;
        }

        public FieldError build() {
            return new FieldError(field, defaultMessage);
        }

        public String toString() {
            return "FieldError.FieldErrorBuilder(field=" + this.field + ", message=" + this.defaultMessage + ")";
        }
    }
}
