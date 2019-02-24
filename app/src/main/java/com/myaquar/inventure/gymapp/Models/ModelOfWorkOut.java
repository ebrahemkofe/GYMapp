package com.myaquar.inventure.gymapp.Models;

public class ModelOfWorkOut {


   private   int image ;
    private String day;
    private String exercise;
    private String time ;


   public ModelOfWorkOut () {}

    public ModelOfWorkOut(int image, String day, String exercise, String time) {
        this.image = image;
        this.day = day;
        this.exercise = exercise;
        this.time = time;
    }


    public int getImage() {
        return image;
    }

    public String getDay() {
        return day;
    }

    public String getExercise() {
        return exercise;
    }

    public String getTime() {
        return time;
    }






}
