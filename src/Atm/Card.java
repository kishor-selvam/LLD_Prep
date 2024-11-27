package Atm;

public class Card {
    private int cardNo;
    protected int balance;
    protected int pinNo;

    public Card(int cardNo, int balance, int pinNo) {
        this.cardNo = cardNo;
        this.balance = balance;
        this.pinNo = pinNo;
    }

    void withdraw(int amount) {
    }

    void balanceCheck() {

    }

    void pinChange() {
    }

    void pinVerify() {
    }
}
