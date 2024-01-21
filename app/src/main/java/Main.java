import jp.ac.uryukyu.ie.e235741.*;

public class Main {
    public static void main(String[] args){
        GameMaster mas = new GameMaster();
        mas.playGame();
        mas.stepGame();
        while (mas.getIsFinish() == false){
        mas.continueGame();
        }
    }
}
