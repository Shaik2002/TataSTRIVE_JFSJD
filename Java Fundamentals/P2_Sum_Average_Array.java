public class P2_Sum_Average_Array {
    public static void main(String[] args) {
        double[] myList = {1.9 , 2.9 , 3.4 , 3.5};
        for(int i = 0 ; i < myList.length ; i ++)
        {
            System.out.println(myList[i]+" ");
        }
        double sum = 0;
        double avg = 0;
                for (int i = 0 ; i < myList.length ; i ++)
                {
                    sum += myList[i];
                }
        System.out.println("Sum is : "+sum);
                for (int i = 0 ; i < myList.length ; i ++)
                {
                    avg = sum/myList.length;
                }
        System.out.println("Average is : "+avg);
    }
}