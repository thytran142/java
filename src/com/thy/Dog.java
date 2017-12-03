package com.thy;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(1,name,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }
    private void chew(){
        System.out.println("Dog chew");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat is called");
        chew();
        super.eat();
    }
}
