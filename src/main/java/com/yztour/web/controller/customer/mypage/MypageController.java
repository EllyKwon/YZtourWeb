package com.yztour.web.controller.customer.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MypageController {

    @GetMapping("")
    public String mypage(){

        return "mypage";
    }

    @GetMapping("/mylist")
    public String mylist(){

        return "mylist";
    }

    @GetMapping("/myreserve")
    public String myreserve(){

        return "reserve";
    }

}
