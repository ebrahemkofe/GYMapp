package com.myaquar.inventure.gymapp.Models;

public class Model_of_item
{
    private  int image;
    private String name;
    private  String jop;

    public Model_of_item(int image, String name, String jop) {
        this.image = image;
        this.name = name;
        this.jop = jop;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getJop() {
        return jop;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJop(String jop) {
        this.jop = jop;
    }
}
