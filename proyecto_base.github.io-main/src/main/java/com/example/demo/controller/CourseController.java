
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @GetMapping("/course/introduction_to_spring")
    public String introductionToSpring() {
        return "introduction_to_spring";
    }

    @GetMapping("/course/spring_core")
    public String springCore() {
        return "spring_core";
    }

    @GetMapping("/course/spring_core_advanced")
    public String springCoreAdvanced() {
        return "spring_core_advanced";
    }

    @GetMapping("/course/spring_core_dev_ops")
    public String springCoreDevOps() {
        return "spring_core_dev_ops";
    }

    @GetMapping("/course/spring_core_ultimate")
    public String springCoreUltimate() {
        return "spring_core_ultimate";
    }

    @GetMapping("/course/thymeleaf")
    public String thymeleaf() {
        return "thymeleaf";
    }
}
