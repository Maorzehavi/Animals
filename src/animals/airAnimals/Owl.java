package animals.airAnimals;

public class Owl extends AirAnimal{
    public Owl() {
    }

    public Owl(String type) {
        super(type);
    }

    public Owl(String type, int age) {
        super(type, age);
    }
    {setCapacity(20);}
    @Override
    public void flee() {
        super.flee(5,2);
    }

    @Override
    protected void eat() {
        super.eat(8,3);
    }

}
