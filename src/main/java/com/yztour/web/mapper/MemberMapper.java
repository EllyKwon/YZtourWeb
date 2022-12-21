package com.yztour.web.mapper;

import com.yztour.web.model.MemberVO;
import org.springframework.stereotype.Repository;

@Repository("MemberMapper")
public interface MemberMapper {
    MemberVO getMemberInfo();

}
