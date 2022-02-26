package com.company;

public class Cars {

        private String model;
    private String color;
    private int engine;
    private int door;
        public void setColor(String color){
            this.color=color;
        }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getColor(){
            return this.color;
        }
        public void start(){
            System.out.println("Araba Çalıştı...");
        }
    public void stop(){
        System.out.println("Araba Durdu...");
    }
    }

