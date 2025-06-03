/* 🧠 Practice Exercise: Java User Input – Survey & Validation
Problem Statement:
Develop a Java program that simulates a user survey. The program should prompt the user to enter the following details:
      Full Name (String)
      Age (int) – Must be between 18 and 100
      Email Address (String) – Should contain '@' and '.'
      Phone Number (String) – Exactly 10 digits
      Favorite Programming Language (String)
      Years of Experience (int) – Cannot be negative
      Willingness to Relocate (boolean: true/false)
Additional Requirements:
Input Validation: If the user provides invalid input, prompt them again until valid data is entered.
Summary Display: After collecting all valid inputs, display a formatted summary of the user's details.
Experience Level: Based on the years of experience:
     Less than 2 years: "Junior Developer"
     2 to 5 years: "Mid-level Developer"
     More than 5 years: "Senior Developer" */
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class Survey {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompting the user to enter full name 
        System.out.print("Enter your name:");
        String name =input.nextLine();

        //prompting the use to enter age
       int Age;
        do {
             System.out.print("enter your age:");
             Age = input.nextInt();
             input.nextLine();
             }
            while (Age<18 || Age>100);
        //prompting the user to enter email address
        String email;
        do {
            System.out.print("Enter your email address:");
            email = input.nextLine();
        } while (!email.contains("@")||!email.contains("."));

        //prompting the user to enter the phone number
        String number;
         do {
             System.out.print("Enter your phone number:");
             number = input.nextLine();
             if (number.length()<10) {
                System.out.println("ENTER YOUR PHONE NUMBER AGAIN!!!!!");
             }
         } while (number.length()!=10);

         //prompting the user to enter his/her favorite programming language
         System.out.println("Enter your favorite programming language:");
         String language =input.nextLine();

         //prompting the user to enter the years of experience
         int years;
        do {
             System.out.print("Yearsof experience:");
             years = input.nextInt();
             input.nextLine();
             if (years<0) {
                System.out.print("INVALID INPUT!!!! years of experience cannot be negative");
             }
        } while (years < 0);//using > causes the loop to exit immediately it reaches 0

        //prompting the user to enter the willingness to relocate
        System.out.print("Would you wish to relocate?(true/false)");
        boolean relocate = input.nextBoolean();

        //OUTPUTTING ALL THE ENTRIES
        System.out.println("Name:" + name);
        System.out.println("Age:" + Age);
        System.out.println("Email:" + email);
        System.out.println("Phone Number:" + number);
        System.out.println("Favorite Language:" + language);
        System.out.println("Experience Years:" + years);
        System.out.println("Willingness to relocate:" + relocate);

        if(years<2){
            System.out.print("Junior Developer");
        }
        else if (2>=years && years<=4) {
             System.out.print("Mid-level Developer");
        }
        else{
            System.out.print("Senior developer");
        }
    }
}