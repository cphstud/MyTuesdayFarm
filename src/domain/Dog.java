package domain;
//21900,Black,German Shepherd Dog,DOMINO,Desexed Female,MACDONALD PARK


public class Dog {
    private int dogID;
    String color;
    String breed;
    String dogName;
    String gender;
    String location;

    public Dog(String color, String breed, String dogName, String gender) {
        this.color = color;
        this.breed = breed;
        this.dogName = dogName;
        this.gender = gender;
    }

    public void setDogID(int id) {
        this.dogID=id;
    }




}
