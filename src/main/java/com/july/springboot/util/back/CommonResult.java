package com.july.springboot.util.back;

import java.io.Serializable;

/**
 * 接口调用失败的异常信息
 */
public class CommonResult implements Serializable {
    /**
     * 异常类
     */
    private String exceptionName;
    /**
     * 错误原因
     */
    private String errorMessage;
    /**
     * 异常堆栈信息
     */
    private String stackTrace;

    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}