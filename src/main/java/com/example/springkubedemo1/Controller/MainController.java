package com.example.springkubedemo1.Controller;

import com.example.springkubedemo1.Service.DataService;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Locale;

@RestController
@RequestMapping("/weatherservice")
public class MainController implements Serializable {
    @GetMapping(produces = "application/json")
    public ResponseEntity<String> getData(@RequestParam String city){
        if(city.toUpperCase().equals("STOCKHOLM")) {
            return new ResponseEntity<>(DataService.getForecast(), HttpStatus.OK);
        }
        JSONObject obj = new JSONObject();
        obj.put("message", "Sorry this city doesnt exist yet in our database");
        return new ResponseEntity<>(obj.toString(), HttpStatus.NOT_FOUND);
    }


}

