class car1
{
    public void details1 (String fueltype , String price)
    {
        System.out.println("The Fuel type of MiniCooper is  "+fueltype+", and the price is "+price);
    }
    public void details2 (String color , int numberofwheels)
    {
        System.out.println("Color is "+color+" and Number of wheels are "+numberofwheels);
    }
}
class BMW extends car1
{
        public void details3 (String model , String color)
        {
            System.out.println("The Model of  BMW is  "+model+", and color is "+color);
        }
        public void details4 (String color , String price)
        {
            System.out.println(color+" colored BMW is "+price);
        }
}
public class PP8_SingleInheritance_Cars {
    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.details3("X9 SUV" , "Sea Green");
        obj.details4("Sea Green" , "1.22Cr");
        obj.details2("Black" , 4);
        obj.details1("Diesel" , "1.2Cr");
    }
}