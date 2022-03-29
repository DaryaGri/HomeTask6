package com.company;

public class Main {

    public static void main(String[] args) {
        Vet vet = new Vet();
        Dog dog = new Dog("Dog Rex", "Meat", "village");
        Cat cat = new Cat("White cat", "Fish", "flat");
        Horse horse = new Horse("Big Horse", "Grass", "Stable");

        Animal[] animals = {dog, cat, horse};

        for(Animal vetAnimal: animals){
            vet.treatAnimal((Animals) vetAnimal);
        }
        // понялв так, что "отправить к ветеринару" - вывести в цикле метод ветеринара)
        //на всякий случай, ниже ещё вывела всех на консоль (просто самой интересно было)))
        System.out.println();

        Animals animal = new Animals("All", "Everywhere");

        info(dog);
        info(cat);
        info(horse);
    }
    public static void info (Animal animal){
        animal.eat();
        animal.sleep();
        animal.makeNoise();
    }
}
