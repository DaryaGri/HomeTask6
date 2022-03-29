package com.company;

public class Cat extends Animals implements Animal {
    private String color;

    public Cat( String color, String food, String location) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Cat eats "+ getFood() +".");
    }

    @Override
    public void sleep() {
        System.out.println("This animal is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-Meow\n");
    }
}
