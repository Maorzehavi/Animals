package animals.seaAnimals;

public class Shark extends SeaAnimals {
    public Shark() {
    }

    public Shark(String type) {
        super(type);
    }

    public Shark(String type, int age) {
        super(type, age);
    }
    {setCapacity(60);}
    @Override
    protected void eat() {
        super.eat(20, 5);
    }
    @Override
    public void flee() {
        super.flee(4, 2);
    }
}
