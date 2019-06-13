package com.example.t00584336.assignment5;

public class Item {
    private String name;
    private String image;
    private int priority;


    public Item()
    {
        super();
    }

    public Item (String name, String image)
    {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public int getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
