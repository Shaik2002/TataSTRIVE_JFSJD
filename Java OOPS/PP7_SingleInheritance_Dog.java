class dogs
{
    public void details (String name , String color , String breed)
    {
        System.out.println("Name of my Dog is "+name+", her color is "+color+" and her breed is "+breed);
    }
}
class puppy extends dogs
{
    public void details1 (String name , String color , String breed , String gender)
    {
        System.out.println("Name of Orra's Puppy is "+name+" and he is "+color+" in color. He is a "+gender+" "+breed);
    }
}
public class PP7_SingleInheritance_Dog {
    public static void main(String[] args) {
        puppy obj = new puppy();
        obj.details("Orra" , "Brown" , "Siberian Husky" );
        obj.details1("Coco" , "Brown" , "Siberian Husky" , "Male");
    }
}
