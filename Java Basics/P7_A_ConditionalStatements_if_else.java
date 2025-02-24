import java.util.Scanner;
public class P7_A_ConditionalStatements_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();
        if (a %2 == 0)
        {
            System.out.println("The Entered Number is "+a+" and it is an Even Number");
        }
        else
        {
            System.out.println("The Entered Number is "+a+" and it is an Odd Number");
        }
    }
}
