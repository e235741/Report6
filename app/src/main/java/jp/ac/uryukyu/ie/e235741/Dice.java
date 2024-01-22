package jp.ac.uryukyu.ie.e235741;
import java.util.Random;
/**
 * サイコロのクラス
 */
public class Dice {
    /** サイコロの目 */
    private int number;
    /** 乱数を得るためのインスタンス */
    private Random rand = new Random();

    /**
     * サイコロをふるメソッド
     * 1~6までの整数をランダムに1つnumberに入れる
     */
    public void rollDice(){
        this.number = rand.nextInt(6) + 1; // 1~6までのランダムな数字
    }
    /**
     * numberのゲッターメソッド
     * @return　number
     */
    public int getNumber() {
        return number;
    }
}
