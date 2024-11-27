
package Atm;

public class CreditCard extends Card {

    public CreditCard(int cardNo, int balance, int pinNo) {
        super(cardNo, balance, pinNo);
    }

    @Override
    void withdraw(int amount) {
        if (amount <= super.balance) {
            super.balance = super.balance - amount - 20;
            System.out.println(amount + " " + "Withdrawal Successfully!");
        } else {
            System.out.println("Insufficient Fund!");
        }
    }

    @Override
    void balanceCheck() {
        System.out.println("Credit Card Balance:" + " " + super.balance);
    }


}

