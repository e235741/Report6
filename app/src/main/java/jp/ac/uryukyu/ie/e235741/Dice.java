package jp.ac.uryukyu.ie.e235741;
import java.util.Random;

public class Dice {
    int number;
    Random rand = new Random();

    public void rollDice(){
        this.number = rand.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }
}
