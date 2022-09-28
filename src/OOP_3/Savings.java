package OOP_3;

public class Savings extends Account{

    public int safetyDepositBoxID;
    public int safetyDepositBoxPin;

    public Savings(String name, String  ssn, double balance) {
        super(name, ssn, balance);
        accountNumber = "2" + accountNumber;
        safetyDepositBoxID = (int)(Math.random()*900 + 100);
        safetyDepositBoxPin = (int)(Math.random()*9000 + 1000);
        setInterestRate();
    }

    @Override
    public void setInterestRate() {
        super.setInterestRate();
        this.interestRate = super.interestRate - 0.25;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: SAVINGS" +
                            "SAFETY DEPOSIT BOX ID: " + safetyDepositBoxID +
                            "SAFETY DEPOSIT BOX PIN :" + safetyDepositBoxPin +
                            "INTEREST RATE: " + this.interestRate);
    }
}
