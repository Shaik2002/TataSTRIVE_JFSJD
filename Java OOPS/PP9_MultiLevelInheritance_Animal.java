class Animal
{
    public void d1 (String animaltype , String foodtype)
    {
        System.out.println("The Animal is "+animaltype+", and it's food type is "+foodtype);
    }
}
class Dog extends Animal
{
    public void d2 (String name , String color , String breed)
    {
        System.out.println("Name of the Dog is "+name+", her color is "+color+" and her breed is "+breed);
    }
}
class Puppy extends Dog
{
    public void d3 (String name , String color , String breed , String gender)
    {
        System.out.println("Name of Orra's Puppy is "+name+" and he is "+color+" in color. He is a "+gender+" "+breed);
    }
}
public class PP9_MultiLevelInheritance_Animal {
    public static void main(String[] args) {
        Puppy O1 = new Puppy();
        O1.d1("Dogs" , "Meat and Biscuits");
        O1.d2("Orra" , "Brown" , "Siberian Husky" );
        O1.d3("Coco" , "Brown" , "Siberian Husky" , "Male");
    }
}
