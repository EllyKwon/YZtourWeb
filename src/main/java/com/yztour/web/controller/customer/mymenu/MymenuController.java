package com.yztour.web.controller.customer.mymenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mymenu/")
public class MymenuController {

    @GetMapping("member")
    public String member(){

        return "member";
    }

    @GetMapping("reserve")
    public String reserve(){

        return "reserve";
    }

}
