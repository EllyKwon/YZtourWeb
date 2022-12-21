package com.yztour.web.mapper;

import com.yztour.web.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("BoardMapper")
public interface BoardMapper {

    /*검색*/
    ArrayList<BoardVO> getSearchList(BoardVO boardVO);
    ArrayList<CommentVO> getCommentList();
    ArrayList<FileVO> getFileList();



    ArrayList<PackageVO> getPackageList();
    ArrayList<ReserveVO> getReserveList();



    /*삽입*/
    BoardVO insert(BoardVO boardVO);

    /*수정*/
    BoardVO update (BoardVO boardVO);

    /*삭제*/
    int delete(int id);
    int deleteAll(int[] ids);


    /*현재페이지수*/
    int pageNum();

    /*페이징처리(전체페이지수)*/
    int totalCount();

    /*다음페이지,이전페이지*/
    BoardVO getNext(int id);

    BoardVO getPrev(int id);

    /*공개*/


    /*일괄공개*/
    int updatePubAll(int[] ids);

}