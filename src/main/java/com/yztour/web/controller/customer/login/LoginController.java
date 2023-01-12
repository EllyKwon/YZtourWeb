package com.yztour.web.controller.customer.login;

import com.yztour.web.model.MemberVO;
import com.yztour.web.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Controller
@Slf4j
@SessionAttributes("memberVO")
@RequiredArgsConstructor
public class LoginController {

    private final UserService service;

    @GetMapping("/login")
    public String login(@ModelAttribute("memberVO") MemberVO memberVO){

        return "login";
    }

    @PostMapping("/login")
    public String login( @Validated @ModelAttribute("memberVO") MemberVO memberVO, BindingResult bindingResult , Model model){

       /* if (!StringUtils.hasText(memberVO.getUserId())){
            bindingResult.addError(new FieldError("memberVO", "userId", "Id please"));
        }*/

        MemberVO loginUser = service.getLogin(memberVO);

        model.addAttribute("memberVO",memberVO);

        if (loginUser==null){
            log.info("login failed");
            bindingResult.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다");
            return "login";
        }


        if (bindingResult.hasErrors()){
            log.info("로그인실패",bindingResult);

            return "login";
        }

        return "redirect:/";
    }

    @ModelAttribute("memberVO") //빈 객체 반환해야 오류안뜸

    public MemberVO setEmptymemberVO() {

        return new MemberVO();

    }


    @GetMapping("/logout")
    public String out(){

        return "out";
    }


    @PostMapping("/join")
    public String join(){

        return "join";
    }



}
