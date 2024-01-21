package jp.ac.uryukyu.ie.e235741;

public class GameMaster {
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private Dice dice3 = new Dice();
    private String comment;
    private boolean isclear;

    static String GoodComment = "おめでとう！ゾロ目になったね！";
    static String BadComment = "残念。また頑張ろう！";

    public void playGame(){
        System.out.println("〜〜 サイコロゾロ目ゲーム 〜〜");

    }

    public void twoDiceGame(){
        dice1.rollDice();
        dice2.rollDice();

        System.out.println("今回出た目は" + dice1.getNumber() + "と" + dice2.getNumber() + "です。");
        if (dice1.getNumber() == dice2.getNumber()){
            this.comment = GoodComment;
            this.isclear = true;
        }else{
            this.comment = BadComment;
            this.isclear = false;
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
        }else{
            this.comment = BadComment;
            this.isclear = false;
        }
        System.out.println(this.comment);
    }

    public String getComment(){
        return this.comment;
    }
    public boolean getIsClear(){
        return this.isclear;
    }
}
