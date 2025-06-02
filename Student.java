/* Practice Question: Student Info & GPA Checker
Write a Java program that:
Prompts the user to enter:
    Their full name (as a String)
    Their student ID (as a String)
    Their age (as an int)
    Their GPA (as a double)
    Whether they are enrolled full-time (true or false as a boolean)
Then, print all the information back to the user in a formatted summary.
If their GPA is greater than or equal to 3.5, print "Status: Honor Student", otherwise print "Status: Regular Student". */

import java.util.Scanner;
public class Student{      
    public static void main(String[] args) {
        
        //prompting the user to enter the full names 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name:");
        String name = input.nextLine();
       
        //prompting the user to enter the school ID
        System.out.print("Enter your student ID:");
        String id = input.nextLine();
        
        //prompting the user to enter their age 
        System.out.print("Enter your age:");
        int age = input.nextInt();
        
        //prompting the user to enter GPA
        System.out.print("Enter your  GPA :");
        double gpa = input.nextDouble();
        
        //prompting the user to enter the full names 
        System.out.print("Are you a student?(true/false):");
        boolean isFulltime = input.nextBoolean();

        System.out.println("FULL NAME:" + name); 
        System.out.println("STUDENT ID:" + id); 
        System.out.println("AGE:" + age);
        System.out.println("GPA:" + gpa); 
        System.out.println("Enrollment status:" + isFulltime); 

        //gpa output
         if (gpa>=3.5) {
            System.out.print("Status:Honor Student");
        } else {
            System.out.print("Status:Regular Student");
        }
    }
}