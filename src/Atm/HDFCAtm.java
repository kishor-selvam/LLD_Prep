package Atm;

public class HDFCAtm implements ATM {

    Card card;

    public HDFCAtm(Card card) {
        this.card = card;
    }

    @Override
    public void withdraw(int amount) {
        card.withdraw(amount);
    }

    @Override
    public void checkBalance() {
        card.balanceCheck();
    }

    @Override
    public void pinChange() {

    }

    @Override
    public void pinVerify() {

    }
}
