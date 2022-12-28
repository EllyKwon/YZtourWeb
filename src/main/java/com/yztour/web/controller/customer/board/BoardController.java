package com.yztour.web.controller.customer.board;

import com.yztour.web.model.BoardVO;
import com.yztour.web.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final UserService service;

    @GetMapping("")
    public String board(BoardVO boardVO, Model model){

        ArrayList<BoardVO> resultList = service.getSearchList(boardVO);

        boardVO.setTotalCount(service.totalCount(boardVO));

        model.addAttribute("resultList", resultList);
        model.addAttribute("totalpage",boardVO.getTotalPage());
        model.addAttribute("boardVO",boardVO);
        model.addAttribute("prevPage",boardVO.getPrevPage());
        model.addAttribute("nextPage",boardVO.getNextPage());
        model.addAttribute("startPage",boardVO.getStartPage());
        model.addAttribute("endPage",boardVO.getEndPage());

        return "board";

    }



//    @GetMapping
//    public void pagination(BoardVO boardVO, Model model) {
//
//        /*현재페이지,전체페이지*/
//        int total = service.totalCount();
//        int nowPageNum = (int) Math.ceil(total/10);
//
//        model.addAttribute("total",total);
//        model.addAttribute("nowPageNum",nowPageNum);
//
//    }


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

