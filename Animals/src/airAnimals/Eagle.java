package airAnimals;

public class Eagle extends AirAnimal {
    public Eagle() {
    }

    public Eagle(String type) {
        super(type);
    }
    public Eagle(String type, int age) {
        super(type, age);
    }
    {
        setCapacity(50);
    }
    @Override
    protected void eat() {
        super.eat(5);
    }
    @Override
    public void flee() {
        super.flee(3);
    }
}
