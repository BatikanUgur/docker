package com.batikanugur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.sql.SQLOutput;
import java.time.LocalTime;

//http:localhost:8080/api/v1
@RestController
@RequestMapping("/api/v1")
public class PersonelController {

    //http://localhost:8080/api/v1
   /* @GetMapping("/hello")
    public String getDockerHello(){

        LocalTime myObj = LocalTime.now();
        return "Hello Docker : " + myObj;
    }
    */
    //http://localhost:8080/api/v1/hello
    @GetMapping("/hello")
    public String getDockerHello() {

        try {
            String SystemName = InetAddress.getLocalHost().getHostName();
             return "Hello Docker :" + SystemName;
        } catch ( Exception e) {
            System.err.println(e.getMessage());
        }

        return "Hello Docker" ;

    }

}
