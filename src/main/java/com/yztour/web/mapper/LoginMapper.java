package com.yztour.web.mapper;

import com.yztour.web.model.MemberVO;
import org.springframework.stereotype.Repository;

@Repository("LoginMapper")
public interface LoginMapper {
    MemberVO getLogin(MemberVO memberVO);

}
