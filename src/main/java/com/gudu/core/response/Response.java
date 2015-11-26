package com.gudu.core.response;

/**
 * Created by qiuhn on 2015/10/17.
 */
public class Response {

    private int code = 1;//成功1，失败0，无改变3

    private Object obj;


    public int getCode() {
        return code;
    }

    public Response setCode(int code) {
        this.code = code;
        return this;
    }


    public Object getObj() {
        return obj;
    }

    public Response setObj(Object obj) {
        this.obj = obj;
        return this;
    }
}
