interface n
{
   int a = 100;
   int b = 50;
   void add();
   void sub();
}
class n1 implements n
{
    public void add()
    {
        System.out.println(a + b);
    }
    public void sub()
    {
        System.out.println(a - b);
    }
}
class n2 implements n
{
    public void add()
    {
        System.out.println(a + b);
    }
    public void sub()
    {
        System.out.println(a - b);
    }
}
public class P15_OOP_HierarchicalInheritance_Interface {
    public static void main(String[] args) {
        n1 A = new n1();
        A.add();
        n2 B = new n2();
        B.sub();
    }
}