package com.example.elibrarydemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(value = {"/", "/elibrary", "/home", "/elibrary/home"})
    public String displayHomePage() {
        return "home/index";
    }
}
