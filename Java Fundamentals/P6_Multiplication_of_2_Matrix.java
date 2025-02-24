import java.util.Scanner;
public class P6_Multiplication_of_2_Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Rows and Columns : ");
        int rows = s.nextInt();
        int cols = s.nextInt();

        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int [][] mul = new int[rows][cols];

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

        System.out.println("Multiplication of 2 Matrix : ");
        for (int i=0 ; i<matrix1.length ; i++)
        {
            for (int j=0 ; j<matrix1.length ; j++)
            {
                for (int k=0 ; k< matrix1.length ; k++)
                {
                    mul[i][j] = mul[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        for (int i=0 ; i< mul.length ; i++)
        {
            for (int j=0 ; j< mul.length ; j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}