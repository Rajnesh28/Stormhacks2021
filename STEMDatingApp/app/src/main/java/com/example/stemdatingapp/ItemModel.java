package com.example.stemdatingapp;

public class ItemModel {
    private int image;
    private String name, age, gpa;

    public ItemModel()
    {}

    public ItemModel(int image, String name, String age, String gpa)
    {
        this.image=image;
        this.name=name;
        this.age=age;
        this.gpa=gpa;

    }

    public int getImage()
    {
        return image;
    }

    public String getName()
    {
        return name;
    }

    public String getAge()
    {
        return age;
    }

    public String getGPA() {return gpa;}



}
