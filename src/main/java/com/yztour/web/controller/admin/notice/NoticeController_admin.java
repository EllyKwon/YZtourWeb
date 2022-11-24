package com.yztour.web.controller.admin.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/notice/")
public class NoticeController_admin {

    @GetMapping("list")
    public String list(){

        return "list_admin";
    }

}
