package com.example.hello;

public class HelloResponse {

    private String message;

    public HelloResponse(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
