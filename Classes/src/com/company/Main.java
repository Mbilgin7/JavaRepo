package com.company;

public class Main {

    public static void main(String[] args) {
	Cars car1 = new Cars();
    car1.setColor("blue");
    car1.setModel("opel");
    car1.setEngine(2);
    car1.setDoor(4);
    System.out.println(car1.getColor());
        System.out.println(car1.getEngine());
        System.out.println(car1.getModel());
        System.out.println(car1.getDoor());

        car1.start();
        car1.stop();
    }
}
