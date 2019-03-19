package com.example.xpeng.eventbusdemo;

public class MessageEvent {
    private String message;

    public MessageEvent(String  msg){
        message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
