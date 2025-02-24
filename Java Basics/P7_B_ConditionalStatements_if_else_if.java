import java.util.Scanner;
public class P7_B_ConditionalStatements_if_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost of Item A : ");
        int a = sc.nextInt();
        System.out.println("Enter Cost of Item B : ");
        int b = sc.nextInt();
        System.out.println("Enter Cost of Item C : ");
        int c = sc.nextInt();
        System.out.println("The Cost of Item A is $" + a + ", Item B is $" + b + ", and Item C is $" + c);
        if (a >= b && a >= c) {
            System.out.println("Item A is Costly with cost $" + a);
        } else if (b >= a && b >= c) {
            System.out.println("Item B is Costly with cost $" + b);
        } else {
            System.out.println("Item C is Costly with cost $" + c);
        }
    }
}
