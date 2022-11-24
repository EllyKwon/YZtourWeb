package com.yztour.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/board/")
public class BoardController_admin {

    @GetMapping("list")
    public String list(){

        return "list_admin";
    }

}
