import airAnimals.Eagle;
import seaAnimals.Crab;
import seaAnimals.Fish;
import seaAnimals.Shark;
import seaAnimals.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Whale whale = new Whale("whale");
        Crab crab = new Crab("crab");
        Shark shark = new Shark();
        Fish fish = new Fish("fish");

        Eagle eagle = new Eagle("eagle");
        System.out.println(shark.getCurrentCapacity());
        shark.swim();
        shark.hunt();
        shark.hunt();
        shark.hunt();
        shark.hunt();
        System.out.println(shark.getCurrentCapacity());
        eagle.fly();
        eagle.land();
        eagle.hunt();
        eagle.flee();
        System.out.println(eagle.getCurrentCapacity());


    }
}