package com.gmail.lizaiatsenko;

/**
 * Created by liza on 02/03/2017.
 */
public class ToshibaRobot implements Robot {
    Leg leg;
    Head head;
    Body body;

    public ToshibaRobot(){}
    public ToshibaRobot(Leg leg, Head head, Body body){
        this.body=body;
        this.head= head;
        this.leg= leg;
    }
    @Override
    public void speak() {
        System.out.println("Hello Toshiba");
    }
    @Override
    public void go() {
        System.out.println("I m walking");
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }


}
