package com.example.picturebackend.common;

import com.example.picturebackend.exception.ErrorCode;

/**
 * 响应结果工具类
 */
public class ResultUtils {

    /**
     *  成功
     *
     * @param data  数据
     * @return  响应
     * @param <T>  数据类型
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(data, "ok", 0);
    }

    /**
     *
     * @param errorCode 错误码
     * @return 响应
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     *
     * @param code 错误码
     * @param message 错误信息
     * @return 响应
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(null, message, code);
    }

    /**
     *
     * @param errorCode 错误码
     * @param message 错误信息
     * @return  响应
     */
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(null, message, errorCode.getCode());
    }
}
