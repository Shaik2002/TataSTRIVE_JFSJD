import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P26_JavaFeatures_LamdaExpression {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 3, 5, 7, 9);
        Consumer<Integer> a = i -> System.out.println(i);
        number.forEach(a);
    }
}