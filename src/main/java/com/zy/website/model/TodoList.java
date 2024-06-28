package com.zy.website.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("todo_list")
public class TodoList {

    @TableId
    private Long id;

    private String name;

    private Integer status;

    private Date createTime;

    private String createName;
}
