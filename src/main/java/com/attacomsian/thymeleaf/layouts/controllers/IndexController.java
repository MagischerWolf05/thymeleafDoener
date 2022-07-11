package com.attacomsian.thymeleaf.layouts.controllers;

import com.attacomsian.thymeleaf.layouts.ModelOfUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/order")
    public String contactPage(Model model) {

        model.addAttribute("ModelOfUser", new ModelOfUser());
        return "Order";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}
