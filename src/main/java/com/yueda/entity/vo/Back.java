package com.yueda.entity.vo;

import java.util.StringJoiner;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2021/6/17 00:35
 */
public class Back {
    private int code;
    private Data data;

    @Override
    public String toString() {
        return new StringJoiner(", ", Back.class.getSimpleName() + "[", "]")
                .add("code='" + code + "'")
                .add("data=" + data)
                .toString();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Back() {
    }
}
