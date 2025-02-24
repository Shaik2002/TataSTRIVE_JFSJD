class Details
{
    public void S1(String name , int age , String branch )
    {
        System.out.println("Details of 1st Student");
        System.out.println("Name - "+name+", Branch - "+branch+" and Age - "+age);
    }
    public void S2(String name , int age , String branch , String rollnumber )
    {
        System.out.println("Details of 2nd Student");
        System.out.println("Name - "+name+", Branch - "+branch+", Age - "+age+" and RollNumber - "+rollnumber);
    }
    public void T1(String name , int age )
    {
        System.out.println("Details of Teacher");
        System.out.println("Name - "+name+" and Age - "+age);
    }
}
public class PP3_ClassMethodsObjects_StudentDetails {
    public static void main(String[] args) {
        Details obj1 = new Details();
        obj1.S1("Shaik" , 22, "IoT");
        Details obj2 = new Details();
        obj2.S2("Ibrahim" , 22 , "AIML" , "20201CIT0010" );
        Details obj3 = new Details();
        obj1.T1("Dr.Nagaraj" , 45);
    }
}
