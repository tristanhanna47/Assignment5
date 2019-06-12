package com.example.t00584336.assignment5;

import android.media.Image;

class Item {
    private String name;
    private Image picture;

    public Item(String banana, int i)
    {
        super();
    }

    public Item (String name, Image picture)
    {
        super();
        this.name = name;
        this.picture = picture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", picture=" + picture +
                '}';
    }
}
