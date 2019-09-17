package com.hlx.result;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.result
 * @Author: Hlx
 * @CreateTime: 2019-09-17 16:19
 * @Description:
 */
public interface ResultCode {

    /**
     * 获取响应码
     * @return 响应码
     */
    int getCode();

    /**
     * 获取响应语义
     * @return 响应语义
     */
    String getMessage();
}
