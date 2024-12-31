package LLD.Questions.Snakes_Ladders;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int numberOfDice = 1;

    Dice(int iNumberOfDice){
        numberOfDice = iNumberOfDice;
    }

    int getNmber(){
        int num = 0;
        int iterator = numberOfDice;
        while(iterator > 0){
            num += ThreadLocalRandom.current().nextInt(1,6);
            iterator--;
        }

        System.out.println("Dice number: " + num);

        return num;
    }
}
