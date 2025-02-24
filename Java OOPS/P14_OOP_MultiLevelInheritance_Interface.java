interface def
{
    int a=20;
    int b=10;
    void add();
    void sub();
}
interface ghi extends def
{
    void mul();
    void div();
}
class jkl implements ghi
{
    public void add(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
    public void mul(){
        System.out.println(a*b);
    }
    public void div(){
        System.out.println(a/b);
    }
}
 public class P14_OOP_MultiLevelInheritance_Interface {
    public static void main(String[] args) {
        jkl A = new jkl();
        A.add();
        A.sub();
        A.mul();
        A.div();
    }
}