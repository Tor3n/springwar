package com.baeldung;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/gggg")
    public @ResponseBody String hiThere(){
        return "hello world!";
    }

    @GetMapping("/gg")
    public String viewIndexPage(Model model) {
        System.out.println("$$$ GGG");
        model.addAttribute("header", "Maven Generate War");
        return "index";
    }

}
