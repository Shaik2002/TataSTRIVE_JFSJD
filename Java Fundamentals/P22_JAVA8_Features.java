interface I
{
    default void phone()
    {
        System.out.println("Phone 1");
    }
}
interface J
{
    default void phone()
    {
        System.out.println("Phone 2");
    }
}
class A
{
    public void phone()
    {
        System.out.println("Phone 3");
    }
}
public class P22_JAVA8_Features implements J {
    public static void main(String[] args) {
        P22_JAVA8_Features obj = new P22_JAVA8_Features();
        obj.phone();
    }
}