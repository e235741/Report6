package jp.ac.uryukyu.ie.e235741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * 「twoDiceGame()」と「threeDiceGame()」のテストのクラス
 *  成功した時、失敗した時でコメントが違うことをテストする
 */
public class RollDiceTest {
    /**
     * テストのメソッド
     * 成功した時と失敗した時それぞれで表示されるメッセージが適切か確かめる
     */
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
