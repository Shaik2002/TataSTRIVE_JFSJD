public class P7_Unchecked_ArithmeticException {
    public static void main(String[] args) {
        int a = 5 , b = 0;
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Any Number which is divided by zero gives an error.");
        }
    }
}