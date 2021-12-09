package com.dz;

public class Client {
    private Chair chair;

    public void sit(Chair chair){
        System.out.println("Sit down on "+ chair.getType());

    };

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }
}
