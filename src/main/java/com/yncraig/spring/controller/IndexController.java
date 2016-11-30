package com.yncraig.spring.controller;

/**
 * Created by craighu on 11/30/16.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {

        model.addAttribute("name", "Yong");

        return "index";
    }
}