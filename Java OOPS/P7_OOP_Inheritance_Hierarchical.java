class Aa
{
    public void hi()
    {
        System.out.println("Hi");
    }
}
class B1 extends Aa
{
    public void hello()
    {
        System.out.println("Hello");
    }
}
class B2 extends Aa
{
    public void how()
    {
        System.out.println("How Are You ?");
    }
}
public class P7_OOP_Inheritance_Hierarchical {
    public static void main(String[] args) {
        Aa ob1 = new Aa();
        ob1.hi();
        B1 ob2 = new B1();
        ob2.hi();
        ob2.hello();
        B2 ob3 = new B2();
        ob3.hi();
        ob3.how();
    }
}