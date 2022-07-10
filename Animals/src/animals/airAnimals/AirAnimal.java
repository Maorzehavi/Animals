package animals.airAnimals;

import animals.Animal;

public abstract class AirAnimal extends Animal {
    public AirAnimal() {
    }

    public AirAnimal(String type) {
        super(type);
    }

    public AirAnimal(String type, int age) {
        super(type, age);
    }

    public void fly() {
        System.out.println("the " + this.getClass().getSimpleName() + " is flying");
    }
    public void land() {
        System.out.println("the " + this.getClass().getSimpleName() + " is landing");
    }

}
