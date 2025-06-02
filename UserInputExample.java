import java.util.Scanner;
public class UserInputExample {

    public static void main(String[] args) {
       
        Scanner Name = new Scanner(System.in);
        System.out.println("Full name:");

        String Fname = Name.nextLine();
       
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your age:");

        int old = Input.nextInt();
       
        Scanner cloudy = new Scanner(System.in);
        System.out.println("Enter your heigth:");

        double tall = cloudy.nextDouble();
       
        Scanner input = new Scanner(System.in);
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

         System.out.println("Enter your full name:" + Fname);
         System.out.println("Age:" + old);
         System.out.println("Heigth:" + tall);
        System.out.println("Student status: " + isStudent);
    }
}