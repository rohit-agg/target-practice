package com.example.samplewebconsole.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> print() {
        return new ResponseEntity<>("Hello from REST", HttpStatus.OK);
    }
}