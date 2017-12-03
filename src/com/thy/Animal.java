package com.thy;

public class Animal {
    private int brain;
    private String name;
    private int body;
    private int size;
    private int weight;

    public Animal(int brain, String name, int body, int size, int weight) {
        this.brain = brain;
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animal eat");
    }
    public void move(){

    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
