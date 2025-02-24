class ArithmeticOperations
{
    public void add (int a , int b)
    {
        System.out.println("Addition of 2 Numbers is : "+(a+b));
    }
    public int sub (int a , int b)
    {
        return a - b;
    }
    public void mul (int a , int b)
    {
        System.out.println("Multiplication of 2 Numbers is : "+(a*b));
    }
    public int div (int a , int b)
    {
        return a / b;
    }
}
public class PP2_ClassMethodsObjects_ArithmeticOperations {
    public static void main(String[] args) {
        ArithmeticOperations obj1 = new ArithmeticOperations();
        obj1.add(4 , 6);
        int result = obj1.sub(20 , 10);
        System.out.println("Subtraction of 2 Numbers is : "+result);
        obj1.mul(5 , 2);
        int results = obj1.div(100 , 10);
        System.out.println("Division of 2 Number is : "+results);
    }
}
