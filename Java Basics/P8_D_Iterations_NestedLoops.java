import java.util.Scanner;
public class P8_D_Iterations_NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 0 ; i < row ; i ++)
        {
            for (int j = 0 ; j < col ; j ++)
            {
                System.out.print(" "+i+j);;
            }
            System.out.println();
        }
    }
}
