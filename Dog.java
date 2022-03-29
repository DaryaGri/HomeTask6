package com.company;

public class Dog extends Animals implements Animal {
    private String name;

    public Dog( String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Dog eats "+ getFood() +".");
    }

    @Override
    public void sleep() {
        System.out.println("This animal is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println( "Woof!\n");
    }


}

