package airAnimals;

import java.util.Random;

public abstract class AirAnimal {
    private String type;
    private int age;
    private int maxCapacity;
    private int currentCapacity;

    private boolean isAlive;
    Random random = new Random();

    public AirAnimal() {
    }

    public AirAnimal(String type) {
        this.type = type;
    }

    public AirAnimal(String type, int age) {
        this.type = type;
        this.age = age;
    }
    {isAlive = true;}

    protected abstract void eat();
    protected abstract void flee();
    protected void eat(int x) {
        if (checkCapacity(this.maxCapacity, this.currentCapacity)) {
            System.out.println("the " + this.getClass().getSimpleName() + " is eating");
            this.currentCapacity += x;
        } else {
            System.out.println("the " + this.getClass().getSimpleName() + " is full");
        }
    }

    private boolean checkCapacity(int maxCapacity, int currentCapacity) {
        return currentCapacity < maxCapacity;
    }
    private boolean checkActionRandom() {
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

    protected void setCapacity(int x) {
        this.maxCapacity = x;
        this.currentCapacity = maxCapacity/2;
    }
    protected void flee(int x) {
        System.out.println("the " + this.getClass().getSimpleName() + " is fleeing");
        currentCapacity -= x;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public int getCurrentCapacity() {
        return currentCapacity;
    }
    public boolean alive() {
        return currentCapacity > 0;
    }

    public void fly() {
        System.out.println("the " + this.getClass().getSimpleName() + " is flying");
    }
    public void land() {
        System.out.println("the " + this.getClass().getSimpleName() + " is landing");
    }

}
