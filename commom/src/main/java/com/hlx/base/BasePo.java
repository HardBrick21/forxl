package com.hlx.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.base
 * @Author: Hlx
 * @CreateTime: 2020/6/13
 * @Description:
 */
@Data
public class BasePo implements Serializable {


    private Date createTime;

    private Date updateTime;
}
