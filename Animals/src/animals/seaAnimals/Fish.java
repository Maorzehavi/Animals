package animals.seaAnimals;

public class Fish extends SeaAnimals{

    public Fish() {
    }
    {setCapacity(10);}
    public Fish(String type) {
        super(type);
    }
    public Fish(String type, int age) {
        super(type, age);
    }
    @Override
     protected void eat() {
     super.eat(2,1);
    }
    @Override
    public void flee() {
        super.flee(2,1);
    }
}
