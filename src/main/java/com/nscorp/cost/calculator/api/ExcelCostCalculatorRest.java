package com.nscorp.cost.calculator.api;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.ResponseData;
import com.nscorp.cost.calculator.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class ExcelCostCalculatorRest {
    private static final String APPLICATION_JSON_VALUE = "application/json";
    @Autowired
    private CostService costService;

    @CrossOrigin
    @RequestMapping(value = "/calculate", method = RequestMethod.POST,
            consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData> calculateAndSaveService(@Valid @RequestBody RequestInputs request) {
        return new ResponseEntity<>(costService.computeCost(request), OK);
    }
}
