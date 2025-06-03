/*✅ Practice Question: Java User Input — Registration & Validation
Problem Statement:
Write a Java program that simulates a simple user registration form. Your program should prompt the user to enter the following details:
     Full name (String)
     Age (int) — must be 18 or older
     Email address (String)
     GPA (double) — must be between 0.0 and 4.0
     Password (String) — must be at least 6 characters long
     Confirm password (String) — must match the password
     Student status (boolean: true/false)
✨ Additional Requirements:
If the user enters invalid values, prompt them again (loop until valid).
After collecting all valid inputs, print a summary of the user's details.
Include a status check:
If GPA >= 3.5, print "Status: Honor Student", else "Status: Regular Student" */
import java.util.Scanner;
public class Registration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt to enter full name
        System.out.print("Enter your name:");
        String name = input.nextLine();

         //prompt to enter age
        int age;
         do {
            System.out.print("Enter your age:");//input by the user
            age=input.nextInt();
            input.nextLine();
         } while (age<18);

         //prompt to enter the email address
         System.out.print("Enter your email:");
         String email =input.nextLine();
         
         //GPA-must be between 0.0 - 4.0
         double GPA;
         do {
            System.out.print("Enter GPA:");
            GPA =input.nextDouble();
            input.nextLine();

         } while (GPA < 0.0 || GPA > 4.0);

         //prompt to enter password
         String password;
         do {
            System.out.print("Enter password:");
            password =input.nextLine();

           if (password.length()<6) {
            System.out.println("Password too short!!TRY AGAIN");
           }
           } while (password.length()<6);
                      
               //password confirmation
               String confirmpassword;
              do {
                System.out.print("Confirm password");
                confirmpassword=input.nextLine();
                 if (!confirmpassword.equals(password)) {
                    System.out.println("Password not MATCHING TRY AGAIN");
                 }
              } while (!confirmpassword.equals(password));

            //boolean values
            System.out.print("Are you a full student?(true/false)");
            boolean isastudent =input.nextBoolean();

            System.out.println("REGISTRATION COMPLETE KINDLY AWAIT TO HEAR FROM US");
            System.out.println("Full names:" +name);
            System.out.println("Age:" + age);
            System.out.println("Email:" + email);
            System.out.println("GPA:" + GPA);
            System.out.println("Student status:" + isastudent);
           
            //Students status
            if (GPA>=3.5) {
                System.out.print("Status:Honor Student");
            } else {
                 System.out.print("Status:regular Student");
            }
        }
       
}