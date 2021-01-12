package com.springfirstdemo.spfirstproject.controller;

import com.springfirstdemo.spfirstproject.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   // @Autowired  // Using spring's dependency injection facilities
    private MyImpl myImpl;  // Field based dependency injection

//    public MyController(MyImpl myImpl){  // Constructor based DI
//        this.myImpl=myImpl;
//    }

    @Autowired
    public void setMyImpl(MyImpl myImpl) {
        this.myImpl = myImpl;
    }

    @GetMapping("/message")
    public String getMessage(){
        return myImpl.getData();
    }
}
