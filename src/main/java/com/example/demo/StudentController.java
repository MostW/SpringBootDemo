package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class StudentController {

//    @Value("${age}")
//    private Integer age;
//
//    @Value("${height}")
//    private Integer height;

    @Value("${content}")
    private String content;



    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public  String show() {
        return "I'm a student!" + content;
    }
}
