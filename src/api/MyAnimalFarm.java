package api;

import domain.Animal;
import domain.Dog;

import java.util.List;

public interface MyAnimalFarm {
    List<Dog> loadDogsIntoYard();
    List<Animal> loadAllAnimals();
}
