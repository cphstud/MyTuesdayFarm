package entries;

import domain.Animal;
import domain.AnimalCave;
import domain.Cat;
import domain.Dog;

public class Main {

    public static void main(String[] args) {

        //int catID, String breed, String name, String location,String gender, boolean marked
        Dog dog = new Dog("red","Puddle","Husky","Male");
        AnimalCave animalCave = new AnimalCave("Viborg");
        Animal animal1 = new Cat(123,"siam","Husky","WATERLOO1","male",true);
        Animal animal2 = new Cat(124,"siam","Lucy","WATERLOO1","female",true);
        animalCave.addAnimalToCave(animal1);
        animalCave.addAnimalToCave(animal2);
        int totalFood = animalCave.computeTotalFoodRequirements();



	// write your code here
    }
}
