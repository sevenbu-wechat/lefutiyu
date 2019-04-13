package com.lefutiyu.sevenbu.mp.common;

/**
 * Created by guoqing on 2019/4/13.
 */
public class Response<T> {
    private String resultCode;
    private String resultMsg;

    private T data;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
