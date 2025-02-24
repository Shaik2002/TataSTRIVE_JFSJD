abstract class shape
{
    abstract void draw();
}
class circle extends shape
{
    void draw()
    {
        System.out.println("Drawing a Circle");
    }
}
public class P10_OOP_Abstraction_Classes {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.draw();
    }
}