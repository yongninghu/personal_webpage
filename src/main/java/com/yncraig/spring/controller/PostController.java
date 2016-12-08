package com.yncraig.spring.controller;

import com.yncraig.spring.domain.Post;
import com.yncraig.spring.service.PostService;
import com.yncraig.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by craighu on 12/7/16.
 */

@Controller
public class PostController {

    PostService ps;

    @Autowired
    public PostController(PostService ps) {
        this.ps = ps;
    }

    @GetMapping("/post")
    public String getPost(Model model) {
        List<Post> pl = ps.getPost("Yong", "all");
        model.addAttribute("postList", pl);
        return "index";
    }

    @GetMapping("/blog")
    public String getBlog(Model model) {
        List<Post> pl = ps.getPost("Yong", "blog");
        model.addAttribute("postList", pl);
        return "index";
    }

    @GetMapping("/tutorial")
    public String getTutorial(Model model) {
        List<Post> pl = ps.getPost("Yong", "tutorial");
        model.addAttribute("postList", pl);
        return "index";
    }

    @GetMapping("/project")
    public String getProject(Model model) {
        List<Post> pl = ps.getPost("Yong", "project");
        model.addAttribute("postList", pl);
        return "index";
    }
}
