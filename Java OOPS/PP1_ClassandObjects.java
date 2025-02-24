class Car
{
    String name = "MiniCooper";
    String color = "Black";
    String price = "1.2Cr";
    String fuel = "Diesel";
}
class Bike
{
    String name = "KTM";
    String color = "Orange";
    String price = "4L";
    String fuel = "Petrol";
}
class Mobile
{
    String name = "Samsung Galaxy S24";
    String color = "Black";
    String price = "75K";
    String processor = "Exnyos";
    String ram = "12GB";
    String rom = "256GB";
}
public class PP1_ClassandObjects {
    public static void main(String[] args) {
        Car obj1 = new Car();
        System.out.println("My favourite Car is : "+obj1.name);
        System.out.println("Price of "+obj1.name+" is : "+obj1.price);
        System.out.println("The best Color in "+obj1.name+" is : "+obj1.color);
        System.out.println("The Fuel type used in "+obj1.name+" is : "+obj1.fuel);
        Bike obj2 = new Bike();
        System.out.println("My favourite Bike is : "+obj2.name);
        System.out.println("Price of "+obj2.name+" is : "+obj2.price);
        System.out.println("The best Color in "+obj2.name+" is : "+obj2.color);
        System.out.println("The Fuel type used in "+obj2.name+" is : "+obj2.fuel);
        Mobile obj3 = new Mobile();
        System.out.println("Phone Owned by me is : "+obj3.name);
        System.out.println("Price of "+obj3.name+" is : "+obj3.price);
        System.out.println("The Color of my "+obj3.name+" is : "+obj3.color);
        System.out.println("The Processor type used in "+obj3.name+" is : "+obj3.processor);
        System.out.println("The Ram of "+obj3.name+" is : "+obj3.ram);
        System.out.println("The Rom of "+obj3.name+" is : "+obj3.rom);
    }
}
