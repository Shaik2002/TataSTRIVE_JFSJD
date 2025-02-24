class Student
{
    Student (String name , int age)
    {
        System.out.println("Name of My Friend is "+name+" and his age is "+age);
    }
    public void friend (String name , String branch , int age)
    {
        System.out.println("Name of my another Friend is "+name+" and his age is "+age);
    }
}
public class PP5_Constructor_StudentDetails {
    public static void main(String[] args) {
        Student obj = new Student("Saqlain" , 22);
        obj.friend("Kaif" , "ECE" , 22);
    }
}
