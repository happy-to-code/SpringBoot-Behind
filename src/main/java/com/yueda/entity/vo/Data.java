package com.yueda.entity.vo;

import java.util.StringJoiner;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2021/6/17 00:34
 */
public class Data {
    private String token;

    public Data() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Data.class.getSimpleName() + "[", "]")
                .add("token='" + token + "'")
                .toString();
    }
}
