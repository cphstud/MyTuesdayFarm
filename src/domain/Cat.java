package domain;

public class Cat extends Animal{
    //c129,Siam,SUSAN,unmarked,WATERLOO CORNER
    private boolean marked;
    private int catFactor;

    public Cat(int catID, String breed, String name, String location,String gender, boolean marked) {
        super(catID,breed,name,gender);
        this.marked = marked;
        this.catFactor = 123;
    }

    public int eating() {
        return 0;
    }

    @Override
    public String getName() {
        String myCatname= super.getName();
        myCatname = "Cat "+myCatname;
        return myCatname;
    }

    @Override
    public int computeFoodRequirement() {
        return catFactor*25;
    }
}
