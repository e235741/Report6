package jp.ac.uryukyu.ie.e235741;

public class GameMaster {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Dice dice3 = new Dice();
    String comment;

    static String GoodComment = "おめでとう！ゾロ目になったね！";
    static String BadComment = "残念。また頑張ろう！";

    public void twoDiceGame(){
        dice1.rollDice();
        dice2.rollDice();

        System.out.println("今回出た目は" + dice1.getNumber() + "と" + dice2.getNumber() + "です。");
        if (dice1.getNumber() == dice2.getNumber()){
            this.comment = GoodComment;
        }else{
            this.comment = BadComment;
        }
        System.out.println(this.comment);
    }

    public String getComment(){
        return this.comment;
    }
}
