class graduation extends Thread
{
    public void run()
    {
    System.out.print("Presidency University");
    System.out.print("Bangalore");
    try { Thread.sleep(5000); } catch (Exception e){}
    }
}
class pu extends Thread
{
    public void run()
    {
        System.out.print("Quwathul Islam PU College");
        System.out.println("Bangalore");
        try { Thread.sleep(3000); } catch (Exception e){}
    }
}
class highschool extends Thread
{
    public void run()
    {
        System.out.print("ST Marys School");
        System.out.println("Bangalore");
        try { Thread.sleep(1000); } catch (Exception e){}
    }
}
public class P11_MultiThreading_GraduationDetails {
    public static void main(String[] args) {
        highschool s1 = new highschool();
        pu s2 = new pu();
        graduation s3 = new graduation();
        s1.start();
        s2.start();
        s3.start();
    }
}
