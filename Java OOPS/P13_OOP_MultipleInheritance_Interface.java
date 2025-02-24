interface swimmer
{
    void swim();
}
interface flyer
{
    void fly();
}
class act implements swimmer,flyer
{
    public void swim()
    {
        System.out.println("I am swimmer");
    }
    public void fly() {
        System.out.println("I am flyer");
    }
}
public class P13_OOP_MultipleInheritance_Interface  {
    public static void main(String[] args) {
        act obj=new act();
        obj.swim();
        obj.fly();
    }
}