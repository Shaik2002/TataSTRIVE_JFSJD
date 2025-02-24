import java.util.Scanner;

public class P6_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name : ");
        String fn = sc.nextLine();
        System.out.println("Enter your Last Name : ");
        String ln = sc.nextLine();
        System.out.println("Enter your University Name : ");
        String un = sc.nextLine();
        System.out.println("Enter your Branch : ");
        String b = sc.nextLine();
        System.out.println("Enter your USN : ");
        String us = sc.nextLine();
        System.out.println("Enter your Age : ");
        int a = sc.nextInt();
        System.out.println("Enter your Mobile Number : ");
        long mn = sc.nextLong();
        System.out.println("Your Details are :");
        System.out.println("Name : "+fn+" "+ln);
        System.out.println("Age : "+a);
        System.out.println("University : "+un+" University");
        System.out.println("Branch : "+b);
        System.out.println("Mobile Number : "+mn);
        System.out.println("USN : "+us);
    }
}
