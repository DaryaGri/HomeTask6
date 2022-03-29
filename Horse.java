package com.company;

public class Horse extends Animals implements Animal {
    private String size;

    public Horse(String size, String food, String location) {
        super(food, location);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("Horse eats "+ getFood() +".");
    }

    @Override
    public void sleep() {
        System.out.println("This animal is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!\n");
    }
}
