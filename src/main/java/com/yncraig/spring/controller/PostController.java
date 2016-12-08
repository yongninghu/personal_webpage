package com.yncraig.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by craighu on 12/7/16.
 */

@Controller
public class PostController {

    @GetMapping("/post")
    public String getPost(Model model) {
        return "index";
    }

    @GetMapping("/blog")
    public String getBlog(Model model) {
        return "index";
    }

    @GetMapping("/tutorial")
    public String getTutorial(Model model) {
        return "index";
    }

    @GetMapping("/project")
    public String getProject(Model model) {
        return "index";
    }
}
