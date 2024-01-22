import jp.ac.uryukyu.ie.e235741.*;
/**
 * メインクラス
 * ゲームを開始して、終了判定が出るまでゲームが続く
 */
public class Main {
    public static void main(String[] args){
        GameMaster mas = new GameMaster();
        mas.playGame();
        mas.stepGame();
        while (mas.getIsFinish() == false){ // 終了判定が出るまでゲームを続ける
        mas.continueGame();
        }
    }
}
