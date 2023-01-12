package com.yztour.web.mapper;

import com.yztour.web.model.FileVO;
import com.yztour.web.model.MemberVO;
import org.springframework.stereotype.Repository;

@Repository("FileMapper")
public interface FileMapper {
    int fileInsert (FileVO fileVO);

}
