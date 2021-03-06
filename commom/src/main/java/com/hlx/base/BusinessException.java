package com.hlx.base;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.hlx.enums.ResultCodes;
import com.hlx.result.ResultCode;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.base
 * @Author: Hlx
 * @CreateTime: 2019-09-17 16:04
 * @Description:
 */
public class BusinessException extends Exception {

    private static final long serialVersionUID = 7535506993439059151L;

    private int code;

    private String simpleMessage;

    private boolean showDetail;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    private BusinessException(int code, String simpleMessage, String message) {
        this(code, simpleMessage, message, false);
    }

    private BusinessException(int code, String simpleMessage, String message, boolean showDetail) {
        super(message);
        this.code = code;
        this.simpleMessage = simpleMessage;
        this.showDetail = showDetail;
    }

    private BusinessException(int code, String simpleMessage, String message, boolean showDetail, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.simpleMessage = simpleMessage;
        this.showDetail = showDetail;
    }

    public int getCode() {
        return code;
    }

    public String getSimpleMessage() {
        return simpleMessage;
    }

    public boolean isShowDetail() {
        return this.showDetail;
    }

    public static BusinessException from(ResultCode resultCode, String... extras) {
        return from(resultCode, false, extras);
    }

    public static BusinessException from(ResultCode resultCode, boolean showDetail, String... extras) {
        return resultCode == null ? defaultException(extras) :
                new BusinessException(resultCode.getCode(), resultCode.getMessage(), buildMessage(resultCode.getMessage(), extras), showDetail);
    }

    public static BusinessException from(BusinessException ex, String... extras) {
        return from(ex, false, extras);
    }

    public static BusinessException from(BusinessException ex, boolean showDetail, String... extras) {
        List<String> messageList = Lists.newArrayListWithExpectedSize(extras.length + 1);
        messageList.add(ex.getMessage());
        messageList.addAll(Arrays.asList(extras));
        return new BusinessException(ex.getCode(), ex.getSimpleMessage(), Joiner.on(", ").join(messageList), showDetail, ex.getCause());
    }

    /**
     * 构建默认业务异常信息
     *
     * @param extras 异常附加信息
     * @return 默认业务异常
     */
    private static BusinessException defaultException(String... extras) {
        String message = buildMessage(ResultCodes.FAIL.getMessage(), extras);
        return new BusinessException(ResultCodes.FAIL.getCode(), message, message);
    }

    /**
     * 自定义异常原因
     *
     * @param reason 异常原因
     * @param extras 异常附加信息
     * @return 异常描述信息
     */
    private static String buildMessage(String reason, String... extras) {
        StringBuilder builder = new StringBuilder();
        builder.append("[").append(reason).append("]");
        for (String message : extras) {
            builder.append(", ").append(message);
        }
        return builder.toString();
    }
}
