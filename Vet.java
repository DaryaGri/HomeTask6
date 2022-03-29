package com.company;

public class Vet {
    public void treatAnimal(Animals animal){
        System.out.print(animal.getFood() + ", ");
        System.out.print(animal.getLocation() +".\n");
    }
}
