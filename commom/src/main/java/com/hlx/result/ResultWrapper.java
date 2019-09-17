package com.hlx.result;

import com.hlx.enums.ResultCodes;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.result
 * @Author: Hlx
 * @CreateTime: 2019-09-17 16:31
 * @Description:
 */
public class ResultWrapper {

    public static Result success() {
        return Result.builder()
                .code(ResultCodes.OK.getCode())
                .message(ResultCodes.OK.getMessage())
                .build();
    }

    public static <T> Result<T> success(T data) {
        return Result.<T>builder()
                .code(ResultCodes.OK.getCode())
                .message(ResultCodes.OK.getMessage())
                .data(data)
                .build();
    }

    public static Result fail(ResultCode ResultCodes) {
        return Result.builder()
                .code(ResultCodes.getCode())
                .message(ResultCodes.getMessage())
                .build();
    }

    public static Result fail(String msg) {
        return Result.builder()
                .code(ResultCodes.FAIL.getCode())
                .message(msg)
                .build();
    }

    public static Result fail(int code, String msg) {
        return Result.builder()
                .code(code)
                .message(msg)
                .build();
    }

}
