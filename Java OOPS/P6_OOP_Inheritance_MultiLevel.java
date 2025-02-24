class a
{
    public void hi()
    {
        System.out.println("Hi");
    }
}
class b extends a
{
    public void hello()
    {
        System.out.println("Hello");
    }
}
class c extends b
{
    public void how()
    {
        System.out.println("How Are You ?");
    }
}
public class P6_OOP_Inheritance_MultiLevel {
    public static void main(String[] args) {
            c smi = new c();
            smi.hi();
            smi.hello();
            smi.how();
    }
}