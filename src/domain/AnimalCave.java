package domain;

import java.util.ArrayList;

public class AnimalCave {
    private String caveName;
    private ArrayList<Animal> animals;
    private Dog[] dogs;
    private Cat[] cats;

    public AnimalCave(String name) {
        this.caveName=name;
        animals = new ArrayList<>();
        dogs = new Dog[123];
    }

    public void addAnimalToCave(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }

    public int computeTotalFoodRequirements() {
        int sum=0;
        int tmpSum=0;
        Animal animal = null;
        for(int i=0;i<animals.size();i++) {
            animal = animals.get(i);
            System.out.println("Name: "+ animal.getName());
            tmpSum = animal.computeFoodRequirement();
            sum = sum + tmpSum;
        }

        return sum;
    }





}
