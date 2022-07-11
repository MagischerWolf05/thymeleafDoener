package com.attacomsian.thymeleaf.layouts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String form(Model model) {
        model.addAttribute("ModelOfUser", new ModelOfUser());
        return "user/editprofile";
    }
    @GetMapping("/user/response")
    public String Results() {
        return "user/response";
    }
    @PostMapping("/user")
    public String Submit(@ModelAttribute ModelOfUser user, Model userModel) {
        userModel.addAttribute("ModelOfUser", user);
        return "user/response";
    }
    @GetMapping("/user/payment")
    public String Result(){
        return "user/payment";
    }
    @PostMapping("/user/payment")
    public String Submit(@ModelAttribute price user, Model userPrice) {
        userPrice.addAttribute("Price", user);
        return "user/Username";}
}
