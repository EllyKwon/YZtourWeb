package com.yztour.web.service;

import com.yztour.web.mapper.BoardMapper;
import com.yztour.web.mapper.MemberMapper;
import com.yztour.web.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserService {  //기능을하는곳
    private final BoardMapper mapper;
    private final MemberMapper memberMapper;

    public ArrayList<BoardVO> getSearchList(BoardVO boardVO){
        return mapper.getSearchList(boardVO);
    }

    public ArrayList<CommentVO> getCommentList(){
        return mapper.getCommentList();
    }

    public ArrayList<FileVO> getFileList(){return  mapper.getFileList();}

    public int totalCount(){
        return mapper.totalCount();
    };



    public MemberVO getMemberInfo(){
        return memberMapper.getMemberInfo();
    }

    public ArrayList<PackageVO> getPackageList(){
        return mapper.getPackageList();
    }

    public ArrayList<ReserveVO> getReserveList(){
        return mapper.getReserveList();
    }

}
