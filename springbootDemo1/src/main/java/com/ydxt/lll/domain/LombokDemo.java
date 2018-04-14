package com.ydxt.lll.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/14.
 */
@ApiModel("Lombok测试实体类")
@Data
public class LombokDemo {
    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("地址")
    private String address;
}
