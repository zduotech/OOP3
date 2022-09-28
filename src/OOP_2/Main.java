package OOP_2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

//        C. Implement application logic in Main class:
//
//        Your application should do the following:
//
//        - Asks the user about the number of emails to be generated (hint: create and store them in an array of super type)

//        - Creates the corresponding number of emails, where it asks the following info for each email:
//                - The type of the email
//                - First name
//                - Last name
//                - Batch Number, if it is for a student email
//                - Department ID, if it is for a staff email
//
//                - After all emails have been created, displays all the information about the created emails and ends the application.
//                - Refer to the attached document for examples of the console output.

        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");

        // Implement the EMA application logic here
        System.out.println("How many emails would you like to create today? ");

        Scanner scan = new Scanner(System.in);
        int howMany = scan.nextInt();


        for (int i = 1; i <= howMany; i++){
            System.out.println("Creating the email #" + i + "..."
                    + "\nChoose the type: \n1. Student \n2. Staff");
            Scanner scan1 = new Scanner(System.in);
            int whichOne = scan1.nextInt();
            if(whichOne == 1){

                StudentEmail studentEmail = new StudentEmail("John ", "Doe ", 9);
                String student[] = new String[]{studentEmail.generateEmail()};
                System.out.println("First Name: " + studentEmail.firstName()
                        +"\nLast Name: " + studentEmail.lastName()
                        +"\nBatch No: " + studentEmail.batchNo
                        +"\nAn email has been created.");
                System.out.println("------------------------------------------------------------------------------");
            } else if(whichOne == 2){
                Email staffEmail = new StaffEmail("Jennifer ", "Lopez", 4);
                String staff[] = new String[]{staffEmail.generateEmail()};

                System.out.println("First Name: " + staffEmail.firstName()
                        +"\nLast Name: " + staffEmail.lastName()
                        +"\nDepartment ID: \n1.Accounting\n2.Sales\n3.Marketing\n4.Instructors");
                Scanner scanDep = new Scanner(System.in);
                // = scanDep.nextInt();
                System.out.println("An email has been created.");
                System.out.println("------------------------------------------------------------------------------");

            }
        }

        System.out.println("Here are the emails that have been created : " +
                "TYPE: ");


        System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
    }
}