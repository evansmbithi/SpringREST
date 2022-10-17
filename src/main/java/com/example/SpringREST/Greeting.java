package com.example.SpringREST;

public class Greeting {
//    Resource representational class
    private final long id;
    private final String content;

    public Greeting (long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
