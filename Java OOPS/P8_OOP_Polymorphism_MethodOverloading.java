class smi
{
    public void add (int a , int b)
    {
        System.out.println("Addition of Two Numbers is : "+(a+b));
    }
    public void add (int a , int b , int c)
    {
        System.out.println("Addition of Three Numbers is : "+(a+b+c));
    }
}
public class P8_OOP_Polymorphism_MethodOverloading {
    public static void main(String[] args) {
        smi obj = new smi();
        obj.add(3 , 6);
        obj.add(3 , 6 , 9);
    }
}