package com.techdecode.notesapp;

import androidx.annotation.NonNull;

public class firebasemodal {

    private String title;
    private String content; // name same as in create in createnote class in putting

    public firebasemodal()
    {

    }

    public firebasemodal(String title,String content)
    {
        this.title=title;
        this.content=content;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content=content;
    }

}
