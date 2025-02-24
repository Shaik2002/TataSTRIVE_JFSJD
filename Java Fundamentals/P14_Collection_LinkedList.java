import java.util.LinkedList;
import java.util.List;

public class P14_Collection_LinkedList {
    public static void main(String[] args) {
        List<String> pd = new LinkedList<String>();
        pd.add("Shaik");
        pd.add("Ibrahim");
        pd.add("St Marys School");
        pd.add("QI College");
        pd.add("Presidency University");
        pd.add("20201CIT0010");
        System.out.println(pd);
        pd.add(2 , "IoT");
        System.out.println(pd);
        pd.add(3 , "Bangalore");
        System.out.println(pd);
        pd.remove("St Marys School");
        pd.remove(6);
        System.out.println(pd);
    }
}
