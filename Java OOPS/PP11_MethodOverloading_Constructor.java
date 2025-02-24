class sm
{
    sm (int a , int b)
    {
        System.out.println("Addition of Two Numbers is : "+(a+b));
    }
    sm (int a , int b , int c)
    {
        System.out.println("Addition of Three Numbers is : "+(a+b+c));
    }
}
public class PP11_MethodOverloading_Constructor {
    public static void main(String[] args) {
        sm obj = new sm(2 , 4);
        sm obj1 = new sm(2 , 4 , 6);
    }
}