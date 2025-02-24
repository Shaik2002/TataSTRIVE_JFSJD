class food
{
    public void f(String foodtype , String name)
    {
        System.out.println("The food types are "+foodtype+" and few of them are "+name);
    }
}
class continental extends food
{
    public void con(String name , int price , String quantity)
    {
        System.out.println(name+" is a Continental dish with the price of Rs."+price+" and the quantity of it is a "+quantity+" portion.");
    }
}
class chinese extends food
{
    public void chi(String name , int price , String quantity)
    {
        System.out.println(name+" is a Chinese dish with the price of Rs."+price+" and the quantity of it is a "+quantity+" portion.");
    }
}
public class PP10_HierarchicalInheritance_Food {
    public static void main(String[] args) {
        food f1 = new food();
        f1.f("Continental and Chinese" , "Noodles,Pasta,Lobster,Friedrice and so on.");
        continental c1 = new continental();
        c1.con("Lobster Penne Alferado" , 2500 , "Medium");
        chinese c2 = new chinese();
        c2.chi("Fried  Rice" , 250 , "Large");
    }
}