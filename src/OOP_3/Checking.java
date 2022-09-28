package OOP_3;

public class Checking extends Account{

    public String debitCardNo;
    public int debitCardPIN;


    public Checking(String name, String ssn, double balance) {
        super(name, ssn, balance);
        accountNumber = "1" + accountNumber;
        generateDebitCardNo();
        debitCardPIN = (int)(Math.random()*9000 + 1000);
        setInterestRate();
    }

    @Override
    public void setInterestRate() {
        super.setInterestRate();
        this.interestRate = super.interestRate * 0.15;
    }

    public void generateDebitCardNo(){
        debitCardNo = "9" + String.valueOf((long)((Math.random() * 900000000000000L) + 100000000000000L));
    }

    @Override
    public void showInfo() {
        super.showInfo();

        System.out.println("NAME: " + name
                + "SSN: " + ssn
                + "ACCOUNT NUMBER: " + accountNumber
                + "ROUTING NUMBER: " + routingNumber
                + "BALANCE: " + balance
                + "ACCOUNT TYPE: " + "Checking "
                + "DEBIT CARD NUMBER: " + debitCardNo
                + "DEBIT CARD PIN: " + debitCardPIN
                + "INTEREST RATE: " + this.interestRate);
    }
}
