package com.yztour.web.model;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {

    private int boardId;
    private String title;
    private String content;
    private Date regdate;
    private int hit;
    private String pubYn;
    private String category;
    private String deleteYn;
    private int memberId;
    private String fileId;


    /*검색*/
    private String searchCondition;
    private String searchKeyword;

    /*페이지쿼리*/
    private int pageNum = 1;
    private int size = 10;
    private int limit;
    private int offset;
    private int totalCount;
    private int totalPage;
    private int displayPageNum=2;
    private int prevPage;
    private int nextPage;
    private int startPage;
    private int endPage;




    public int getTotalPage() {
        return (int) Math.ceil(totalCount/10.0);
    }

    public int getLimit() {
        return size;
    }

    public int getOffset() {
        return pageNum == 1 ? 0 : ((pageNum-1) * size);
    }

    public int getPrevPage() {
        return pageNum-1;
    }

    public int getNextPage() {
        return pageNum+1;
    }

    public int getStartPage() {
        return (endPage - displayPageNum) + 1;
    }

    public int getEndPage() {
        return (startPage + displayPageNum) -1;
    }
}
