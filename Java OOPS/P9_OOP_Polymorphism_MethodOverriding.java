class over
{
    public void mobile()
    {
        System.out.println("Samsung");
    }
}
class riding extends over
{
    public void mobile()
    {
        System.out.println("I Phone");
    }
}
public class P9_OOP_Polymorphism_MethodOverriding {
    public static void main(String[] args) {
        riding obj = new riding();
        obj.mobile();
    }
}