package seaAnimals;

import java.util.Random;

public abstract class SeaAnimals {
    private String type;
    private int age;
    private int maxCapacity;
    private int currentCapacity;
    private boolean isAlive;
    Random random = new Random();

    public SeaAnimals() {
    }

    public SeaAnimals(String name) {
        this.type = name;
    }

    public SeaAnimals(String name, int age) {
        this.type = name;
        this.age = age;
    }

    {
        this.isAlive = true;
    }

    public abstract void flee();

    protected abstract void eat();

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public boolean alive() {
        return currentCapacity > 0;
    }

    public boolean checkActionRandom() {
        return random.nextBoolean();
    }

    public void hunt() {
        System.out.println("the " + this.getClass().getSimpleName() + " is hunting");
        if (checkActionRandom()) {
            System.out.println("successes!");
            eat();
        } else {
            System.out.println("unlucky!\nmaybe next time");
        }
    }

    protected void flee(int x) {
        System.out.println("the " + this.getClass().getSimpleName() + " is fleeing");
        currentCapacity -= x;
    }

    protected void eat(int x) {
        if (this.currentCapacity + x <= this.maxCapacity) {
            System.out.println("the " + this.getClass().getSimpleName() + " is eating");
            this.currentCapacity += x;
        } else {
            System.out.println("your stomach is full");
        }
    }

    protected void setCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = maxCapacity / 2;
    }

    public String getType() {
        return this.type;
    }

    protected void swim() {
        System.out.println("the " + this.getClass().getSimpleName() + " is swimming");
    }
}
