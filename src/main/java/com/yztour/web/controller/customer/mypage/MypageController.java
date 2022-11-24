package com.yztour.web.controller.customer.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage/")
public class MypageController {

    @GetMapping("member")
    public String member(){

        return "member";
    }

    @GetMapping("reserve")
    public String reserve(){

        return "reserve";
    }

}
