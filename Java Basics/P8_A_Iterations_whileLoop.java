import java.util.Scanner;

public class P8_A_Iterations_whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of i : ");
        int i = sc.nextInt();
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        while (i <= n)
        {
          sum = sum + i;
          i++;
        }
        System.out.println("The Sum is : "+sum);
    }
}