package domain;

public class Cat {
    //c129,Siam,SUSAN,unmarked,WATERLOO CORNER
    private int catID;
    private String breed;
    private String name;
    private boolean marked;
    private String location;
    private int catFactor;

    public Cat(int catID, String breed, String name, boolean marked, String location) {
        this.catID = catID;
        this.breed = breed;
        this.name = name;
        this.marked = marked;
        this.location = location;
        this.catFactor = 123;
    }

    public int eating() {
        return 0;
    }

}
