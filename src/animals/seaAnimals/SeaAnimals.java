package animals.seaAnimals;

import animals.Animal;

public abstract class SeaAnimals extends Animal {
    public SeaAnimals() {
    }
    public SeaAnimals(String type) {
        super(type);
    }

    public SeaAnimals(String type, int age) {
        super(type, age);
    }


    protected void swim() {
        System.out.println("the " + this.getClass().getSimpleName() + " is swimming");
    }
}
