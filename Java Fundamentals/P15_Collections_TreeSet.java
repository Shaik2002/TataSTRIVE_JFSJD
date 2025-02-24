import java.util.Set;
import java.util.TreeSet;

public class P15_Collections_TreeSet {
    public static void main(String[] args) {
        Set<Integer>numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.clear();
        System.out.println(numbers);
        numbers.add(20);
        System.out.println(numbers.add(10));
        System.out.println(numbers);
    }
}
