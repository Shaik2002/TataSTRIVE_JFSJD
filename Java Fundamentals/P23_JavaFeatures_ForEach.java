import java.util.Arrays;
import java.util.List;

public class P23_JavaFeatures_ForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(11,22,33,44,55,66,77,88,99);
        values.forEach(i -> System.out.println(i));
    }
}