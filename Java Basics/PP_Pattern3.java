import java.util.Scanner;
public class PP_Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int row = sc.nextInt();
        for (int i = 0 ; i < row ; i ++)
        {
            for(int j = 0 ; j < row - i - 1 ; j ++ )
            {
                System.out.print(" ");
            }
            for (int j = 0 ; j <= i ; j ++)
            {
                System.out.print("* ");;
            }
            System.out.println();
        }
    }
}