import java.util.HashSet;
import java.util.Set;

public class P12_Collections_HashSet {
    public static void main(String[] args) {
        Set<String>fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits);
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
    }
}