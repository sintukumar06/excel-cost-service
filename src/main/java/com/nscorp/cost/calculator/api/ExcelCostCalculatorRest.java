package com.nscorp.cost.calculator.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExcelCostCalculatorRest {
    private static final String APPLICATION_JSON_VALUE = "application/json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Autowired
    private CostService costService;

    @CrossOrigin
    @RequestMapping(value = "/calculate", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public String calculateAndSaveService1(@RequestBody String request) throws JsonProcessingException {
        UnitTrainInputs unitTrainInputs = gson.fromJson(request, UnitTrainInputs.class);
        return gson.toJson(costService.computeCost(unitTrainInputs));
    }
}
