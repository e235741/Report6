package jp.ac.uryukyu.ie.e235741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameMasterTest {
    @Test void GameMasterTest(){
        GameMaster mas = new GameMaster();
        mas.twoDiceGame();
        
        if (mas.dice1.getNumber() == mas.dice2.getNumber()){
            assertEquals(mas.getComment(),"おめでとう！ゾロ目になったね！");
        }else{
            assertEquals(mas.getComment(),"残念。また頑張ろう！");
        }
    }
}
