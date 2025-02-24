class Vehicles
{
    Vehicles (String color , long price , int tyresize)
    {
        System.out.println("Color of TATA Ace is  "+color+" . Price is "+price+" and the Tyre Size is "+tyresize);
    }
    Vehicles(String fueltype , String capacity)
    {
        System.out.println("The Fuel Type is "+fueltype+" and its Capacity is "+capacity);
    }
    public void car (String name , String color , String price)
    {
        System.out.println("Car is "+name+" its color is "+color+" and the price is "+price);
    }
    public void bike (String name , long price , String color)
    {
        System.out.println(name+" is "+price+" and the best Color is "+color);
    }
}
public class PP6_ConstructorMethod_Vehicles {
    public static void main(String[] args) {
        Vehicles obj = new Vehicles("White" , 230579L , 8);
        Vehicles obj1 = new Vehicles("Diesel" , "20L");
        obj.car("MiniCooper" , "Black" , "1.2Cr");
        obj1.bike("KTM" , 123455L , "Orange");

    }
}
