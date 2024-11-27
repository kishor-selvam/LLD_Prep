import Atm.Card;
import Atm.CreditCard;
import Atm.DebitCard;
import Atm.HDFCAtm;

public class Main {
    public static void main(String[] args) {
        Card credit = new CreditCard(1, 2000, 1212);
        Card debit = new DebitCard(1, 3000, 1111);

//        HDFCAtm atm = new HDFCAtm(debit);
//        atm.checkBalance();
//        atm.withdraw(250);
//        atm.checkBalance();

        HDFCAtm atm = new HDFCAtm(credit);
        atm.checkBalance();
        atm.withdraw(200);
        atm.checkBalance();
    }
}