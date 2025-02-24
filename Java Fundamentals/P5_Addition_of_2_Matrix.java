import java.util.Scanner;
public class P5_Addition_of_2_Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Rows and Columns : ");
        int rows = s.nextInt();
        int cols = s.nextInt();

        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int [][] sum = new int[rows][cols];

        System.out.println("Enter elements of 1st Matrix : ");
        for (int i=0 ; i<rows ; i++)
        {
            for (int j=0 ; j<cols ; j++)
            {
                matrix1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd Matrix : ");
        for (int i=0 ; i<rows ; i++)
        {
            for (int j=0 ; j<cols ; j++)
            {
                matrix2[i][j] = s.nextInt();
            }
        }

        System.out.println("Sum of 2 Matrix : ");
        for (int i=0 ; i<rows ; i++)
        {
            for (int j=0 ; j<cols ; j++)
            {
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }

        for (int i=0 ; i<rows ; i++)
        {
            for (int j=0 ; j<cols ; j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}