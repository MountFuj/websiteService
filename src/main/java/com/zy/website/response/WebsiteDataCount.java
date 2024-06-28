package com.zy.website.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "网站数据统计")
public class WebsiteDataCount {

    @ApiModelProperty(value = "访问量")
    private Integer readCount;

    @ApiModelProperty(value = "在线人数")
    private Integer onlineCount;

    @ApiModelProperty(value = "资源数量")
    private Integer resourceCount;

    @ApiModelProperty(value = "笔记数量")
    private Integer noteCount;

    @ApiModelProperty(value = "注册用户数量")
    private Integer registerCount;

    @ApiModelProperty(value = "VIP用户数量")
    private Integer vipUserCount;
}
