public class P3_Max_Min_Array {
    public static void main(String[] args) {
        int[] A = {9 , 10 , 1 , 2 , 10 , 4};
        int max = A[0];
        int min = A[0];
        for (int i = 0 ; i < A.length ; i++)
        {
            if (A[i] > max)
            {
                max = A[i];
                System.out.println("Maximum is : "+max);
            }
        }
        for (int i = 0 ; i < A.length ; i++)
        {
            if (A[i] < min)
            {
                min = A[i];
                System.out.println("Minimum is : "+min);
            }
        }
    }
}