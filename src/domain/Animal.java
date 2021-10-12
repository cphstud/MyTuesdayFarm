package domain;

public abstract class Animal  {
    protected int animalID;
    protected String breed;
    protected String name;
    protected String gender;

    public Animal(int animalID, String breed, String name, String gender) {
        this.animalID = animalID;
        this.breed = breed;
        this.name = name;
        this.gender = gender;
    }

    public int getAnimalID() {
        return animalID;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public abstract int computeFoodRequirement();
}
