package seaAnimals;

public class Whale extends SeaAnimals {
    public Whale() {
    }
    public Whale(String type) {
        super(type);
    }
    public Whale(String name, int age) {
        super(name, age);
    }
    {setCapacity(50);}

    @Override
    public void flee() {
        super.flee(7);
    }
    @Override
    protected void eat() {
        super.eat(9);
    }

}