package com.hlx.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hlx.base.BasePo;
import lombok.Data;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.po
 * @Author: Hlx
 * @CreateTime: 2020/6/13
 * @Description:
 */
@Data
@TableName("user")
public class User extends BasePo {


    private static final long serialVersionUID = -5989165756659422942L;
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    @TableField(value = "username")
    private String userName;
    @TableField(value = "password")
    private String passwwod;

}
