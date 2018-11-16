package com.corundumstudio.socketio.demo;

public class ChatObject {

    private String userName;
    private String toUserName;
    private String message;

    public ChatObject() {
    }

    public ChatObject(String userName, String toUserName, String message) {
        super();
        this.userName = userName;
        this.toUserName = toUserName;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToUserName() {
        return toUserName;
    }
    public void setTOUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
