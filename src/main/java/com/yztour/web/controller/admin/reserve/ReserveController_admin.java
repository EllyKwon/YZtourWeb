package com.yztour.web.controller.admin.reserve;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class ReserveController_admin {

    @GetMapping("reserve")
    public String reserve(){

        return "reserve_admin";
    }

}
