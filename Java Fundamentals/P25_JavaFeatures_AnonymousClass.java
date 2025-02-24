import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P25_JavaFeatures_AnonymousClass {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 4, 6, 8, 10);
        Consumer<Integer> a = new Consumer<Integer>()
        {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };
        number.forEach(a);
    }
}