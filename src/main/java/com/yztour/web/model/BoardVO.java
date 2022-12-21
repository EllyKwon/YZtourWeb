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
    private int total;
    private int nowPageNum;


    /*public int getTotal() {
        return service.totalCount();
    }

    public int getNowPageNum() {
        return (int) Math.ceil(total/10);
    }*/

    public int getLimit() {
        return size;
    }

    public int getOffset() {
        return pageNum == 1 ? 0 : ((pageNum-1) * size);
    }
}
