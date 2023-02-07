package org.launchcode.Ch13Lecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping
    public String index(Model model) {
        // We need to pass in a value for title so it renders on
        // out in the index.html file
        model.addAttribute("title", "Home page");
        return "index";
    }

}
