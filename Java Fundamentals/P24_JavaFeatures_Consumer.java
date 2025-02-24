import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class consumer implements Consumer<Integer>
{
    public void accept (Integer i)
    {
        System.out.println(i);
    }
}
public class P24_JavaFeatures_Consumer {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> a = new consumer();
        number.forEach(a);

    }
}
