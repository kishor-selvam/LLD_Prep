package Atm;

public class DebitCard extends Card {

    public DebitCard(int cardNo, int balance, int pinNo) {
        super(cardNo, balance, pinNo);
    }

    @Override
    void withdraw(int amount) {
        if (amount <= super.balance) {
            super.balance = super.balance - amount - 10;
            System.out.println(amount + " " + "Withdrawal Successfully!");
        } else {
            System.out.println("Insufficient Fund!");
        }
    }

    @Override
    void balanceCheck() {
        System.out.println("Debit Card Balance:" + " " + super.balance);
    }


}
