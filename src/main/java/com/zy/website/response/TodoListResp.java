package com.zy.website.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ApiModel(value = "待办列表")
public class TodoListResp implements Serializable {

    @ApiModelProperty(value = "待办id")
    private Long id;

    @ApiModelProperty(value = "待办名称")
    private String name;

}
