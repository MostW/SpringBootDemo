package com.example.demo.controller;

import com.example.demo.configuration.Studentproperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class TestController {

//    @Value("${age}")

//    private Integer age;
//
//    @Value("${height}")
//    private Integer height;

//    @Value("${content}")
//    private String content;

    @Autowired
    private Studentproperty studentProperty;

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public  String show(@PathVariable("id") Integer myId) {
//        return "I'm a student!" + "id is " + myId ;
        return studentProperty.getContent();
    }
}
