package com.qf.springmybatis.entity;

/**
 * @author:wh
 * @Date:2019/7/30
 */
public class ResultBean<T> {
    private String responseCod;
    private T data;

    public ResultBean(String responseCod, T data) {
        this.responseCod = responseCod;
        this.data = data;
    }

    public ResultBean() {
    }

    public String getResponseCod() {
        return responseCod;
    }

    public void setResponseCod(String responseCod) {
        this.responseCod = responseCod;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
