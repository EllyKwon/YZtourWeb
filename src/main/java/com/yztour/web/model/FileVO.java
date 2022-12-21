package com.yztour.web.model;

import lombok.Data;

import java.util.Date;

@Data
public class FileVO {

    private String fileId;
    private int fileOrder;
    private String fileName;
    private int size;
    private String path;
    private Date regdate;
    private String deleteYn;

}
