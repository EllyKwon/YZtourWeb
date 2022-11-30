package com.yztour.web.controller.customer.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("")
    public String board(){

        return "board";
    }

    @GetMapping("/write")
    public String write(){

        return "write";
    }

    @GetMapping("/detail")
    public String detail(){

        return "detail";
    }

    @GetMapping("/search")
    public String search(){

        return "search";
    }

    @GetMapping("/update")
    public String update(){

        return "update";
    }

    @GetMapping("/delete")
    public String delete(){

        return "delete";
    }

}

