package com.ifpe.atv_form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BatismoController {
    @GetMapping("/batismo")
    public String batismoPage(){
        return "batismo";
    }
    @PostMapping("/batismo")
    public String providerToString(br.ifpe.atividade.Web4.models.BatismoModel batismoModel){
        System.out.println(batismoModel.toString());
        return "batismo";
    }
    @GetMapping("/")
    public String home(){
        return "batismo";
    }
}
