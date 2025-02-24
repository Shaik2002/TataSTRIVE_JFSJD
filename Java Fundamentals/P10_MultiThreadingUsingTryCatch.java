class hey extends Thread
{
    public void run()
    {
        for(int i=0; i<=4; i++) {
            System.out.println("Hey!");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}
class hello extends Thread
{
    public void run()
    {
        for(int i=0; i<=4; i++)
        {
            System.out.println("Hello!");
            try{ Thread.sleep(3000);} catch (Exception e) {}
        }
    }
}
public class P10_MultiThreadingUsingTryCatch {
    public static void main(String[] args) {
        hey obj1 = new hey();
        hello obj2 = new hello();
        obj1.start();
        obj2.start();
    }
}