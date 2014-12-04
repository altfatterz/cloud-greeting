package com.backbase.progfun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Value("${foo.greeting}")
    private String greeting;

    @RequestMapping("/greet")
    String index(@RequestParam(defaultValue = "World") String name, Model model) {
        model.addAttribute("message", greeting + " " + name);
        return "index";
    }
}