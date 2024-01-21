package jp.ac.uryukyu.ie.e235741;
import java.util.Scanner;

public class GameMaster {
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private Dice dice3 = new Dice();
    private String comment;
    private boolean isclear;
    private int input;
    private boolean isFinish = false;
    private int success;
    private int miss;

    static String GoodComment = "おめでとう！ゾロ目になったね！";
    static String BadComment = "残念。また頑張ろう！";

    public void playGame(){
        System.out.println("〜〜 サイコロゾロ目ゲーム 〜〜");
        System.out.println("サイコロをゾロ目に揃えましょう！２個モードか３個モードを選べます。");
        System.out.println("プレイしたい方の番号を入力してください。");
    }

    public void goGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("0  ２個モード");
        System.out.println("1  ３個モード");
        input = scanner.nextInt();
    }

    public void stepGame(){
        this.goGame();
        if (this.getInput() == 0){
            this.twoDiceGame();
        }else{
            this.threeDiceGame();
        }
    }

    public void choice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ゲームを続けますか？");
        System.out.println("0  ２個モードをプレイする。");
        System.out.println("1  ３個モードをプレイする。");
        System.out.println("2  ゲームをやめる。");
        input = scanner.nextInt();
    }

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

    public void finishGame(){
        isFinish = true;
        System.out.println("あなたは" + (success + miss) + "回中" + success + "回成功しました！");
        System.out.println("ゲーム終了。お疲れ様でした。");
    }

    public void twoDiceGame(){
        dice1.rollDice();
        dice2.rollDice();

        System.out.println("今回出た目は" + dice1.getNumber() + "と" + dice2.getNumber() + "です。");
        if (dice1.getNumber() == dice2.getNumber()){
            this.comment = GoodComment;
            this.isclear = true;
            this.success += 1;
        }else{
            this.comment = BadComment;
            this.isclear = false;
            this.miss += 1;
        }
        System.out.println(this.comment);
    }

    public void threeDiceGame(){
        dice1.rollDice();
        dice2.rollDice();
        dice3.rollDice();

        System.out.println("今回出た目は" + dice1.getNumber() + "と" + dice2.getNumber() +  "と" + dice3.getNumber() + "です。");
        if (dice1.getNumber() == dice2.getNumber() && dice1.getNumber() == dice3.getNumber()){
            this.comment = GoodComment;
            this.isclear = true;
            this.success += 1;
        }else{
            this.comment = BadComment;
            this.isclear = false;
            this.miss += 1;
        }
        System.out.println(this.comment);
    }

    public String getComment(){
        return this.comment;
    }
    public boolean getIsClear(){
        return this.isclear;
    }
    public int getInput(){
        return this.input;
    }
    public boolean getIsFinish(){
        return this.isFinish;
    }
}
