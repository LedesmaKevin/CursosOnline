
package course.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @GetMapping("/courses/introduction-to-spring")
    public String introductionToSpring() {
        return "introduction_to_spring";
    }

    @GetMapping("/courses/spring-core")
    public String springCore() {
        return "spring_core";
    }

    @GetMapping("/courses/spring-core-advanced")
    public String springCoreAdvanced() {
        return "spring_core_advanced";
    }

    @GetMapping("/courses/spring-core-dev-ops")
    public String springCoreDevOps() {
        return "spring_core_dev_ops";
    }

    @GetMapping("/courses/spring-core-ultimate")
    public String springCoreUltimate() {
        return "spring_core_ultimate";
    }

    @GetMapping("/courses/thymeleaf")
    public String thymeleaf() {
        return "thymeleaf";
    }
}
