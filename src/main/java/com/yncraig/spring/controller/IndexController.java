package com.yncraig.spring.controller;

/**
 * Created by craighu on 11/30/16.
 */

import com.yncraig.spring.domain.Post;
import com.yncraig.spring.domain.User;
import com.yncraig.spring.service.UserService;
import com.yncraig.spring.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    UserService us;

    PostService ps;

    @Autowired
    public IndexController(UserService us, PostService ps) {
        this.us = us;
        this.ps = ps;
    }

    @GetMapping("/")
    public String index(Model model) {

        User user = us.getUser("Yong");
        model.addAttribute("name", user.getName());
        model.addAttribute("intro", user.getIntro());

        List<Post> pl = ps.getPost("Yong", "all");
        model.addAttribute("postList", pl);
        return "index";
    }
}