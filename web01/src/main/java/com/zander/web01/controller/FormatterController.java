package com.zander.web01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormatterController {


    @RequestMapping("/type/conversion")
    public void typeConversionTest(String goodsName, float weight) {
        System.out.println("goodsName:"+ goodsName);
        System.out.println("weight" + weight);
    }
}
