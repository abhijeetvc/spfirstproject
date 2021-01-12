package com.springfirstdemo.spfirstproject.impl;

import com.springfirstdemo.spfirstproject.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {

    @Override
    public String getData() {
        return "Hello Spring Program";
    }
}
