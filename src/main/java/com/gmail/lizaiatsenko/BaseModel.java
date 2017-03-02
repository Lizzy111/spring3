package com.gmail.lizaiatsenko;

/**
 * Created by liza on 02/03/2017.
 */
public abstract class BaseModel implements Robot {
    private Head head;
    private Leg leg;
    private Body body;

    public BaseModel(){
        System.out.println(this+"call parent constructor");
    }

    public BaseModel(Head head, Leg leg, Body body) {
        this.head = head;
        this.leg = leg;
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
