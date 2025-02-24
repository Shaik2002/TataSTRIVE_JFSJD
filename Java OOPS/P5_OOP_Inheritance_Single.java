class A
{
    public void hi()
    {
        System.out.println("Hi");
    }
}
class B extends A
{
    public void hello()
    {
        System.out.println("Hello");
    }
}
public class P5_OOP_Inheritance_Single {
    public static void main(String[] args) {
     B obj = new B();
     obj.hi();
     obj.hello();
    }
}