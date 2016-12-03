package com.yncraig.spring.controller;

/**
 * Created by craighu on 11/30/16.
 */

import com.yncraig.spring.domain.User;
import com.yncraig.spring.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    IndexService is;

    @GetMapping("/")
    public String index(Model model) {

        User user = is.getUser();
        model.addAttribute("name", user.getName());
        model.addAttribute("intro", user.getIntro());

        return "index";
    }
}