import java.util.ArrayList;
import java.util.List;

public class P13_Collection_ArrayList {
    public static void main(String[] args) {
        List details = new ArrayList();
        details.add("Shaik Ibrahim");
        details.add("Bangalore");
        details.add("SeaFood");
        details.add("Kashmir");
        details.add(10);
        details.add(22);
        details.add("Delhi");
        details.add("Upma");
        System.out.println(details);
        details.add(3, "Gulmarg");
        System.out.println(details);
        System.out.println(details.get(2));
        System.out.println(details.indexOf(22));
        details.remove(5);
        System.out.println(details);
    }
}
