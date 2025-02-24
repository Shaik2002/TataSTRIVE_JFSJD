class person
{
    private String name = "Shaik Ibrahim";
    private int age = 22;
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String Name)
    {
        this.name = Name;
    }
    public void setAge(int Age)
    {
        this.age = Age;
    }
}
public class P11_OOP_Encapsulation_getsetMethod {
    public static void main(String[] args) {
        person a = new person();
        a.setName("Mohammed Fazeel");
        a.setAge(21);
        System.out.println("My name is "+a.getName()+" and my age is "+a.getAge());
    }
}