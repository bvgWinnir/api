package com.yuanh.sae.site.common;

import java.util.Map;

/**
 * @author sammy
 * @email wangquan@yuanh.com.cn
 */
public class WebResult<T> {

    /**
     * 执行结果
     */
    private boolean success;

    /**
     * 结果集
     */
    private T data;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回状态码
     * @see WebResultCode
     */
    private String code;

    private Map<String ,Object> status;

    public WebResult() {

        this.code = WebResultCode.SUCCESS;
        this.success = true;
    }


    public WebResult(boolean success, T data) {

        this.success = success;
        this.data = data;
    }

    public WebResult(boolean success, T data, String message) {

        this.success = success;
        this.data = data;
        this.message = message;
    }

    public WebResult(boolean success, T data, String message, String code) {

        this.success = success;
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public WebResult(boolean success, String message) {

        this.success = success;
        this.message = message;
    }

    public WebResult(String code, String message) {

        this.code = code;
        this.message = message;
    }


    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {

        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.setSuccess(false);
        this.message = message;
    }

    public Map<String, Object> getStatus() {
        return status;
    }

    public void setStatus(Map<String, Object> status) {
        this.status = status;
    }
}

