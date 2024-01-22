package jp.ac.uryukyu.ie.e235741;
import java.util.Scanner;
/**
 * ゲームを動かすクラス
 */
public class GameMaster {
    private Dice dice1;
    private Dice dice2;
    private Dice dice3;
    /** 成功した時、失敗した時に出力されるコメントを保存する */
    private String comment;
    /** ゾロ目が揃ったかを記録する　テストの時に使われる */
    private boolean isClear;
    /** プレイしている人の入力を記録する */
    private int input;
    /** ゲームを終了するかどうかを記録する */
    private boolean isFinish;
    /** ゾロ目が揃った回数を記録する */
    private int success;
    /** ゾロ目が揃わなかった回数を記録する */
    private int miss;
    /** ゾロ目が揃った際に出力されるコメント */
    static String GoodComment = "おめでとう！ゾロ目になったね！";
    /** ゾロ目が揃わなかった際に出力されるコメント */
    static String BadComment = "残念。また頑張ろう！";

    /**
     * サイコロのインスタンス生成＆フィールド初期化
     */
    public GameMaster(){
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.dice3 = new Dice();
        this.isFinish = false;
    }

    /**
     * ゲームの導入部分を担当するメソッド
     */
    public void playGame(){
        System.out.println("〜〜 サイコロゾロ目ゲーム 〜〜");
        System.out.println("サイコロゾロ目ゲーム サイコロをゾロ目に揃えましょう！");
        System.out.println("ゲームを開始しましょう！２個モードか３個モードを選べます。");
        System.out.println("プレイしたい方の番号を入力してください。");
    }
    /**
     * ゲームのモード選択のメソッド
     * プレイヤーにやりたい方を入力させる
     */
    public void goGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("0  ２個モード");
        System.out.println("1  ３個モード");
        input = scanner.nextInt();
    }
    /** ゲームを進行するメソッド */
    public void stepGame(){
        this.goGame();
        if (this.getInput() == 0){
            this.twoDiceGame();
        }else{
            this.threeDiceGame();
        }
    }
    /** ゲームを続けるかやめるかを選ばせるメソッド */
    public void choice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ゲームを続けますか？ 選択してください。");
        System.out.println("0  ２個モードをプレイする。");
        System.out.println("1  ３個モードをプレイする。");
        System.out.println("2  ゲームをやめる。");
        input = scanner.nextInt();
    }
    /** ゲームを続けるかやめるかを判定するメソッド */
    public void continueGame(){
        this.choice();
        if (this.getInput() == 0){
            this.twoDiceGame();
        }else if (this.getInput() == 1){
            this.threeDiceGame();
        }else{
            this.finishGame();
        }
    }
    /**
     * ゲームを終了する時のメソッド
     * 成功回数を表示し、終了時のコメントを表示する
     */
    public void finishGame(){
        isFinish = true; // 終了判定
        System.out.println("あなたは" + (success + miss) + "回中" + success + "回成功しました！");
        System.out.println("ゲーム終了。お疲れ様でした。");
    }
    /**
     * サイコロ２個のゾロ目ゲームを行うメソッド
     * サイコロの目を決め、表示して、コメントも表示する
     */
    public void twoDiceGame(){
        dice1.rollDice();
        dice2.rollDice();

        System.out.println("今回出た目は" + dice1.getNumber() + "と" + dice2.getNumber() + "です。");
        if (dice1.getNumber() == dice2.getNumber()){
            this.comment = GoodComment;
            this.isClear = true;
            this.success += 1; // 成功回数カウント
        }else{
            this.comment = BadComment;
            this.isClear = false;
            this.miss += 1; // 失敗回数カウント
        }
        System.out.println(this.comment);
    }
    /** サイコロ3個のゾロ目ゲームを行うメソッド */
    public void threeDiceGame(){
        dice1.rollDice();
        dice2.rollDice();
        dice3.rollDice();

        System.out.println("今回出た目は" + dice1.getNumber() + "と" + dice2.getNumber() +  "と" + dice3.getNumber() + "です。");
        if (dice1.getNumber() == dice2.getNumber() && dice1.getNumber() == dice3.getNumber()){
            this.comment = GoodComment;
            this.isClear = true;
            this.success += 1; // 成功回数カウント
        }else{
            this.comment = BadComment;
            this.isClear = false;
            this.miss += 1; // 失敗回数カウント
        }
        System.out.println(this.comment);
    }
    /**
     * コメントのゲッターメソッド
     * @return comment
     */
    public String getComment(){
        return this.comment;
    }
    /**
     * isClearのゲッターメソッド
     * @return isClear
     */
    public boolean getIsClear(){
        return this.isClear;
    }
    /**
     * inputのゲッターメソッド
     * @return input
     */
    public int getInput(){
        return this.input;
    }
    /**
     * isFinishのゲッターメソッド
     * @return isFinish
     */
    public boolean getIsFinish(){
        return this.isFinish;
    }
}
