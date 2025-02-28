package com.example.picturebackend.common;

import com.example.picturebackend.exception.ErrorCode;
import lombok.Data;

@Data
public class BaseResponse<T> {

    private int code;

    private T data;

    private String message;


    public BaseResponse(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public BaseResponse(int code, T data) {
        this(data, "", code);
    }

    public BaseResponse(ErrorCode errorCode) {
        this(null, errorCode.getMessage(), errorCode.getCode());
    }
}
