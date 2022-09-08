package com.example.bai1bt1money.controller;


import com.example.bai1bt1money.model.Tudien;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    static  Map<String,String> tudien;
    static {
        tudien = new HashMap<>();
        tudien.put("banana","chuoi");
        tudien.put("apple","tao''");
        tudien.put("orange","cam");
        tudien.put("alo","blo");
    }

    @GetMapping("/aloso")
    public String alo(){
        return "aloso";
    }


    @PostMapping("/alo")
    public String submit(@RequestParam String alo, Model model){
        boolean check = tudien.containsKey(alo);
        if (check){
            String result = tudien.get(alo);
            model.addAttribute("result",result);
            return "aloso";
        }
        model.addAttribute("result","alosoooooo");
        return "aloso";
    }

}
