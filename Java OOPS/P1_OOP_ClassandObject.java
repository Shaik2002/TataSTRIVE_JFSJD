class dog
{
    String name = "Max";
    String color = "White";
    int age = 2;
}
class cat
{
    String name = "Orra";
    String color = "Brown";
    int age = 1;
}
public class P1_OOP_ClassandObject {
    public static void main(String[] args) {
       dog obj1 = new dog();
       cat obj2 = new cat();
        System.out.println("Name of the Dog is : "+obj1.name);
        System.out.println("Age of "+obj1.name+" is : "+obj1.age+" Years");
        System.out.println("Color of "+obj1.name+" is : "+ obj1.color);
        System.out.println("Name of the Cat is : "+obj2.name);
        System.out.println("Age of "+obj2.name+" is : "+obj2.age+" Years");
        System.out.println("Color of "+obj2.name+" is : "+ obj2.color);
        System.out.println(obj2.name+" and "+obj1.name+" are Best Friends.");
    }
}
