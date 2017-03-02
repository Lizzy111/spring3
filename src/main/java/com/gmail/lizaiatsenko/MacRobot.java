package com.gmail.lizaiatsenko;

/**
 * Created by liza on 02/03/2017.
 */
public class MacRobot extends BaseModel {

    private String color;

    public MacRobot() {
    }

    @Override
    public void speak() {
        System.out.println("I am MacRobot");
    }

    @Override
    public void go() {
        System.out.println("I am walking, Mac");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
