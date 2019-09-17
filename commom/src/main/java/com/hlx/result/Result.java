package com.hlx.result;

import com.hlx.enums.ResultCodes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.result
 * @Author: Hlx
 * @CreateTime: 2019-09-17 16:26
 * @Description:
 */
@Data
@Builder
@ApiModel
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -6739086600568130048L;
    @ApiModelProperty("返回码")
    private int code;
    @ApiModelProperty("返回信息")
    private String message;
    @ApiModelProperty("返回数据")
    private T data;
    @ApiModelProperty("状态")
    public boolean status(){
        return code == ResultCodes.OK.getCode();
    }
}
