package animals.seaAnimals;

public class Whale extends SeaAnimals {
    public Whale() {
    }
    public Whale(String type) {
        super(type);
    }
    public Whale(String name, int age) {
        super(name, age);
    }
    {setCapacity(100);}

    @Override
    public void flee() {
        super.flee(7,1);
    }
    @Override
    protected void eat() {
        super.eat(22,7);
    }


}
