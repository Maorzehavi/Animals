package animals.seaAnimals;

public class Crab extends SeaAnimals {
    public Crab() {
    }
    public Crab(String type) {
        super(type);
    }
    public Crab(String type, int age) {
        super(type, age);
    }
    {setCapacity(14);}
    @Override
    protected void eat() {
       super.eat(2,1);
    }
    @Override
    public void flee() {
        super.flee(2,1);
    }
    public void walk() {
        System.out.println("the "+this.getClass().getSimpleName()+" is walking");
    }
}
