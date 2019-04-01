package com.ledict.entity;

import lombok.Data;
import lombok.Getter;

import java.util.Date;


@Data
public class Calendar {

//    private String content_id;
    private String contentId;

//    private String user_id;
    private String userId;
//    private Integer is_exit_content;
    private Integer isExitContent;
//    private Date create_time;
    private Date createTime;
//    private Date update_time;
    private Date updateTime;

    public Date getUpdateTime() {
        return updateTime == null ? new Date() : updateTime;
    }
}
