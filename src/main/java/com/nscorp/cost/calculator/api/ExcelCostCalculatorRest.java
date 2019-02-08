/**
 * 
 */
package com.nscorp.cost.calculator.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * @author a6poc
 *
 */
@RestController
public class ExcelCostCalculatorRest {

    private static final String APPLICATION_JSON_VALUE = "application/json";

    @CrossOrigin
    @RequestMapping(value = "/test", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    @ResponseBody
    public String calculateAndSaveService1(@RequestBody String formula) throws JsonProcessingException
    {
    	return "{ \"hello\": \"World\"} ";
    }
}
