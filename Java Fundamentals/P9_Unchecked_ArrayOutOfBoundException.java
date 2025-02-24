public class P9_Unchecked_ArrayOutOfBoundException {
    public static void main(String[] args) {
        int[] array = new int[4];
        try {
            for (int i = 0; i <= array.length; i++)
            {
                System.out.println(array[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index exceeding the length.");
        }
    }
}