package net.crunchdroid.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/loginn")
    public String loginn(Model model) {
        return "loginn";
    }

    @GetMapping("/registrationn")
    public String register() {
        return "registrationn";
    }

    @GetMapping("/index")
    public String index(Model model) {
        return "indexx";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}
