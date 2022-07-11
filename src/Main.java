import animals.airAnimals.Eagle;
import animals.seaAnimals.Crab;
import animals.seaAnimals.Fish;
import animals.seaAnimals.Shark;
import animals.seaAnimals.Whale;

public class Main {
    public static void main(String[] args) {
        Whale whale = new Whale("whale",60);

        System.out.println(whale.getCurrentCapacity());

    }
}