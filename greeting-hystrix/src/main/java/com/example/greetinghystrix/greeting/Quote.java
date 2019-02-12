package com.example.greetinghystrix.greeting;

import java.io.Serializable;

public class Quote implements Serializable {
    private String msg;
    private String fortune;

    public Quote(){

    }

    public Quote(String msg, String fortune) {
        this.msg = msg;
        this.fortune = fortune;
    }

    public String getMsg() {
        return msg;
    }

    public String getFortune() {
        return fortune;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }
}
