package com.yztour.web.controller.customer.mypage;

import com.yztour.web.model.MemberVO;
import com.yztour.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MypageController {

    @Autowired
    private UserService service;

    @GetMapping("")
    public String mypage(MemberVO memberVO, Model model){
        MemberVO member = service.getMemberInfo();
        model.addAttribute("member",member);
        System.out.println(member);
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
