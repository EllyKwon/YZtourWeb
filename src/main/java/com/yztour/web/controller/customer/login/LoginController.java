package com.yztour.web.controller.customer.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @GetMapping("/join")
    public String join(){

        return "join";
    }
}
