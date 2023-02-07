package org.launchcode.Ch13Lecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public String index() {
        return "student/index";
    }

    @GetMapping("form")
    public String form() {
        return "student/form";
    }

}