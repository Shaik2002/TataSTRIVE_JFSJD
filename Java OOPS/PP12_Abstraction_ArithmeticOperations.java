
abstract class operations
{
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
}
class arithmetic extends operations
{
    int a = 20 , b = 10;
    void add()
    {
        System.out.println("Addition: " + (a + b));
    }
    void sub()
    {
        System.out.println("Subtraction: " + (a - b));
    }
    void mul()
    {
        System.out.println("Multiplication: " + (a * b));
    }
    void div()
    {
        System.out.println("Division: " + (a / b));
    }
}
public class PP12_Abstraction_ArithmeticOperations {
    public static void main(String[] args) {
        arithmetic a = new arithmetic();
        a.add();
        a.sub();
        a.mul();
        a.div();
    }
}