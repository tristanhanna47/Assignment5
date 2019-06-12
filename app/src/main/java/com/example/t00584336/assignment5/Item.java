package com.example.t00584336.assignment5;

import android.media.Image;

class Item {
    private int id;
    private String title;

    public Item()
    {
        super();
    }

    public Item (int id, String title)
    {
        super();
        this.id = id;
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title=" + title +
                '}';
    }
}
