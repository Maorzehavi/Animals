package animals.airAnimals;

public class Eagle extends AirAnimal {
    public Eagle() {
    }

    public Eagle(String type) {
        super(type);
    }
    public Eagle(String type, int age) {
        super(type, age);
    }
    {setCapacity(60);}
    @Override
    protected void eat() {
        super.eat(15,6);
    }


    @Override
    public void flee() {
        super.flee(5,2);
    }
}
