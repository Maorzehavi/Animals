import animals.airAnimals.Eagle;
import animals.seaAnimals.Crab;
import animals.seaAnimals.Fish;
import animals.seaAnimals.Shark;
import animals.seaAnimals.Whale;

public class Main {
    public static void main(String[] args) {
        Whale whale = new Whale("whale",60);
        Crab crab = new Crab("crab");
        Shark shark = new Shark();
        Fish fish = new Fish("fish");

        Eagle eagle = new Eagle("eagle");
        System.out.println(shark.getCurrentCapacity());
        shark.swim();
        shark.flee();
        fish.flee();
        System.out.println(shark.getCurrentCapacity());
        eagle.fly();
        eagle.land();
        eagle.hunt();
        eagle.flee();
        System.out.println(eagle.getCurrentCapacity());
        System.out.println(fish.isAlive());


    }
}