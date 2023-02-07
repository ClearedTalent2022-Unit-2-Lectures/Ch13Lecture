package org.launchcode.Ch13Lecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("student")
public class StudentController {

    // let's render out a list of students on the student
    // main page
    @GetMapping
    public String index(Model model) {
        // let's create a list of students
        ArrayList<String> students = new ArrayList();
        students.add("Anthony S");
        students.add("David");
        students.add("Mayfield");
        students.add("Cristen");
        students.add("Joveth");
        students.add("Kayla");

        model.addAttribute("students", students);

        return "student/index";
    }

    @GetMapping("form")
    public String form() {
        return "student/form";
    }

}
