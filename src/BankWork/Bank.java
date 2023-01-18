package BankWork;

public class Bank {
    private String accountNumber;

    private double accountBalance;

    private  String customerName =  "Ibrahim Ozigis";

    private String email = "ibrahimozigis0@gmail.com";
    private  Long phoneNumber;

    public void depositAmount(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " is  made. New Balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if(accountBalance - withdrawAmount < 0) {
            System.out.println("INSUFFICIENT FUNDS: YOU ONLY HAVE $" + accountBalance + " in your account"  );
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("withdrawal of $" + withdrawAmount + " is Processed, Remaining balance = $" + accountBalance );
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

