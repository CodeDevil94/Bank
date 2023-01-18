package BankWork;

public class MainBank {
    public static  void main(String[] args) {
    Bank ibroBank  = new Bank();
    ibroBank.setAccountBalance(1000.00);
    ibroBank.setAccountNumber("3090876542");
    ibroBank.setCustomerName("Ibrahim sanusi");
    ibroBank.setEmail("ibrahim@yahoo.com");
    ibroBank.setPhoneNumber(765324L);

    ibroBank.withdrawFunds(100.00);
    ibroBank.depositAmount(250.00);
    ibroBank.withdrawFunds(50.00);


    ibroBank.withdrawFunds(200);
    ibroBank.withdrawFunds(100);
    ibroBank.depositAmount(1000);
    ibroBank.withdrawFunds(355.65);
    ibroBank.withdrawFunds(225.12);
        ibroBank.withdrawFunds(707.32);
    }
}
