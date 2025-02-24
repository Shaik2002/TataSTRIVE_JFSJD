import java.util.Scanner;
public class P8_B_Iterations_forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , n , sum = 0 ;
        System.out.print("Enter the Value of i : ");
        i = sc.nextInt();
        System.out.print("Enter the Value of n : ");
        n = sc.nextInt();
        for (i = 0; i <= n ; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum : "+sum);
    }
}
