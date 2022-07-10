package animals;

import java.util.Random;

public abstract class Animal {
    private String type;
    private int age;
    private int maxCapacity;
    private int currentCapacity;
    private boolean isAlive;
    Random random = new Random();

    public Animal() {
    }

    public Animal(String type) {
        this.type = type;
    }

    public Animal(String type, int age) {
        this.type = type;
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

    public boolean checkActionRandom() {
        return random.nextBoolean();
    }

    public int randomNumber(int maxNumber, int minNmber) {
        int x = random.nextInt(maxNumber-minNmber) + minNmber;
        return x;
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

    protected void flee(int maxNumber, int minNumber) {
        System.out.println("the " + this.getClass().getSimpleName() + " is fleeing");
        currentCapacity -= randomNumber(maxNumber, minNumber);
        ;
        isAlive();
    }

    public boolean isAlive() {
        if (currentCapacity <= 0) {
            System.out.println("the " + this.getClass().getSimpleName() + " died");
            this.isAlive = false;
            return false;
        }
        return true;
    }

    protected void eat(int maxNumber, int minNumber) {
        int x = randomNumber(maxNumber, minNumber);
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

    public int getAge() {
        return age;
    }

}
