interface Animal1
{
    void cat();
    void travel();
}
class Mammal implements Animal1
{
    public void cat()
    {
        System.out.println("Mammal Cats");
    }
    public void travel()
    {
        System.out.println("Mammal Travels");
    }
}
public class P12_OOP_Interface {
    public static void main(String[] args) {
       Mammal m = new Mammal();
       m.cat();
       m.travel();
    }
}