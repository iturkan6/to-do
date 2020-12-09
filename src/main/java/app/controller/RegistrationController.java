package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class RegistrationController {
    @GetMapping("/register")
    public String getHandler(){
        return "sign-up";
    }
    @PostMapping
    public String syun() {
        return "landing";
        }

    
}
