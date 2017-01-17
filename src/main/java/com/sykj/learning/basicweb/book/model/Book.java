package com.sykj.learning.basicweb.book.model;

import java.util.Date;

/**
 * book model.
 *
 * @author Yang XuePing
 */
public class Book {
    private String id;
    private String name;
    private Date createdTime;
    private Date updatedTIme;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTIme() {
        return updatedTIme;
    }

    public void setUpdatedTIme(Date updatedTIme) {
        this.updatedTIme = updatedTIme;
    }
}
