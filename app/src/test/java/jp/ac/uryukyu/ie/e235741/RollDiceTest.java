package jp.ac.uryukyu.ie.e235741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RollDiceTest {
    @Test void Test(){
        GameMaster mas = new GameMaster();
        mas.twoDiceGame();
        if (mas.getIsClear() == true){
            assertEquals(mas.getComment(),"おめでとう！ゾロ目になったね！");
        }else{
            assertEquals(mas.getComment(),"残念。また頑張ろう！");
        }

        mas.threeDiceGame();
        if (mas.getIsClear() == true){
            assertEquals(mas.getComment(),"おめでとう！ゾロ目になったね！");
        }else{
            assertEquals(mas.getComment(),"残念。また頑張ろう！");
        }
    }
}
