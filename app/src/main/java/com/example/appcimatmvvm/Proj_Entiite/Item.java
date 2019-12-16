package com.example.appcimatmvvm.Proj_Entiite;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName= "item_table")
public class Item {
    @PrimaryKey(autoGenerate=true)
    private int id;
    private String itemeqipement;
    private String tagequippemnt;
    private int codeArticle;

    public Item(String itemeqipement, String tagequippemnt, int codeArticle) {
        this.itemeqipement=itemeqipement;
        this.tagequippemnt=tagequippemnt;
        this.codeArticle=codeArticle;
    }

    public void setId(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getItemeqipement() {
        return itemeqipement;
    }

    public String getTagequippemnt() {
        return tagequippemnt;
    }

    public int getCodeArticle() {
        return codeArticle;
    }
}