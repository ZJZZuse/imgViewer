package com.isoftstone.kaoqin.vo;

/**
 * Created by wb-zhangjinzhong on 2015/12/22.
 */
public class MyResult<T> {

    private boolean success = false;
    private String message = "default";
    private T data;

    public static MyResult<?> success(){

        MyResult<?> r = new MyResult<Object>();

        r.setSuccess(true);

        return r;
    }

    public static <T1> MyResult<T1> success(T1 data){

        MyResult<T1> r = new MyResult<T1>();

        r.setData(data);
        r.setSuccess(true);

        return r;
    }

    public static MyResult<?> failed(String msg) {

        MyResult<?> r = new MyResult<Object>();

        r.setSuccess(false);
        r.setMessage(msg);

        return r;

    }

    public MyResult() {
    }

    public MyResult(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
