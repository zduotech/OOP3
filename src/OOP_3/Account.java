package OOP_3;

public class Account implements BaseInterestRate{
        protected String name;// - represents an accountholder's full name
        protected String ssn;// - represents an accountholder's ssn
        protected double balance;// - represents the balance of the account
	    protected String accountNumber;// - represents the unique account number
        protected String routingNumber;// - represents the routing number
	    protected double interestRate;


    @Override
    public double getBaseInterestRate() {
        return BASE_INTEREST_RATE;
    }

    @Override
    public void setInterestRate() {

    }

    public Account(String name, String ssn, double balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        generateAccountNumber();
        generateRoutingNumber();
        getBaseInterestRate();
    }


    public  void generateAccountNumber(){

        accountNumber = ssn.substring(ssn.length()-4) + String.valueOf((long)((Math.random() * 9000000) + 1000000));
            System.out.println(accountNumber);
        }

        public  void generateRoutingNumber(){

        routingNumber = "00" + String.valueOf((long)((Math.random() * 9000000) + 1000000));
            System.out.println(routingNumber);
        }


        public void deposit(double Amount){

        balance += Amount;
            System.out.println("Your new balance after DEPOSIT is : " + balance);
        }

        public void withdraw(double Amount){

        balance -= Amount;
            System.out.println("Your new balance after WITHDRAW is : " + balance);
        }

        public void showInfo(){
            System.out.println("NAME: " + name
                                + "SSN: " + ssn
                                + "ACCOUNT NUMBER: " + accountNumber
                                + "ROUTING NUMBER: " + routingNumber
                                + "BALANCE: " + balance);
        }

    }
