package OOP_2;

public class Email {


//    A. Implement the class Email.
//
//    It contains the following:
//
//    Data fields with private visibility:
        private String firstName;// - represents first name of the email owner
        private String lastName; // - represents last name of the email owner
        private String emailAddress;// - represents the email address of the email owner
        private String password;//  - represents the password for the email
        private double capacity;// - represents the capacity of the email in GBs.
        private double maxAttachmentSize;// - represents the maximum size of the attachments in MBs.
        final String DOMAIN_NAME = "duotech.io";// - represents a constant, domain name, which must be initialized to "duotech.io".

//
//
//    Constructors:
//            - constructor that accepts and initializes firstName , lastName.
//

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Email() {

    }


//    Methods:
//            - getters and setters for all the fields.

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String emailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double capacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double maxAttachmentSize() {
        return maxAttachmentSize;
    }

    public void setMaxAttachmentSize(double maxAttachmentSize) {
        this.maxAttachmentSize = maxAttachmentSize;
    }

    public String DOMAIN_NAME() {
        return DOMAIN_NAME;
    }


//     - generateEmail() - provide some generic implementation (return an empty string).
    public  String generateEmail(){
        return "";
    }

//            - generatePassword() - provide some generic implementation (return an empty string).

    public  String generatePassword(){
        return "";
    }
//            - toString() - return the following field values in following format:
//    NAME: firstName + lastName
//    GENERATED EMAIL ADDRESS: emailAddress
//    GENERATED PASSWORD: password
//    CAPACITY: capacity
//    MAX ATTACHMENT SIZE: maxAttachmentSize

    @Override
    public String toString() {
        return     "NAME: " + firstName + lastName
        +"GENERATED EMAIL ADDRESS: " + emailAddress
        +"GENERATED PASSWORD: " + password
        +"CAPACITY: " +capacity
        +"MAX ATTACHMENT SIZE: " + maxAttachmentSize;
    }
}
