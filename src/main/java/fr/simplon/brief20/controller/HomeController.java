package fr.simplon.brief20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String dashboard(Model model) {
        return "pages/dashboard";
    }
}
