package OOP_2;

import java.util.Arrays;
import java.util.Scanner;

public class StaffEmail extends Email{

    //    C. Implement the class StaffEmail which is a subclass of Email
//
//            It contains the following:
//
//    Data fields with private visibility:
    //private final String TYPE = "Staff";
    private int departmentId;// - represents the department id of the staff member as int.
    //                     1 Accounting;
//                     2 Sales;
//                     3 Marketing;
//                     4 Instructors;
    private final String DEPARTMENTS[] = new String[] {"Accounting", "Sales", "Marketing", "Instructors"}; //-// represents a constant, a String array that holds all departments values.
    //    It should be initialized to hold "Accounting", "Sales", "Marketing", "Instructors" departments.
    private String Staff;
//              Constructor:
//            - constructor that accepts and initializes firstName , lastName and departmentId.
//              Besides that it needs to do the following:
//            - initializes emailAddress using generateEmail() method.
//            - initializes password using generatePassword() method.
//            - initializes capacity to 50.
//            - initializes maxAttachmentSize to 100.

    public StaffEmail(String firstName, String lastName, int departmentId){
        super();
        setFirstName(firstName);
        setLastName(lastName);

//        Scanner scan = new Scanner(System.in);
//        departmentId = scan.nextInt();


        if(departmentId == 1){

            System.out.println(DEPARTMENTS[0]);

        }
        else if (departmentId == 2) {
            System.out.println(DEPARTMENTS[1]);
        }
        else if (departmentId == 3) {
            System.out.println(DEPARTMENTS[2]);
        }
        else if (departmentId == 4) {
            System.out.println(DEPARTMENTS[3]);
        }
        this.generateEmail();
        this.generatePassword();
        setCapacity(50);
        setMaxAttachmentSize(100);





    }
//
//
//    Methods:
//            - generateEmail() - override it so it returns the following:
//    firstName + . + lastName + _d + departmentId + @ + department + . + DOMAIN_NAME
//    Example: Akmal Bek, departmentId 4 (Instructors) -> akmal.bek_d4@instructors.duotech.io

    @Override
    public String generateEmail() {
        return firstName() + "." + lastName() + "_d" + departmentId + "@" + DEPARTMENTS + "." + super.DOMAIN_NAME;
    }


//
//     - generatePassword() - override it so it returns the following:

//    random password with length 8 that consists of lowercase, uppercase chars and numbers and special chars such as !@#$%^&*()
//    Example: $Qcr48hJ

    @Override
    public String generatePassword() {
        return super.generatePassword();
    }


//     - toString() - override it so it returns the info in following format (use super class's toString() for super class field values):
//            TYPE: Staff
//            DEPARTMENT: department
//            NAME: firstName + lastName
//            GENERATED EMAIL ADDRESS: emailAddress
//            GENERATED PASSWORD: password
//            CAPACITY: capacity
//            MAX ATTACHMENT SIZE: maxAttachmentSize


    @Override
    public String toString() {
        return "TYPE: " + Staff
                + "\nDEPARTMENT: " + DEPARTMENTS
                + "\nNAME: " + firstName() + " " + lastName()
                + "\nGENERATED EMAIL ADDRESS: " + emailAddress()
                + "\nGENERATED PASSWORD: " + password()
                + "\nCAPACITY: " +capacity()
                + "\nMAX ATTACHMENT SIZE: " +maxAttachmentSize();
    }
}
