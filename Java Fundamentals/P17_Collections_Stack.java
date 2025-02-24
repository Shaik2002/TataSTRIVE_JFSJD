import java.util.List;
import java.util.Stack;

public class P17_Collections_Stack {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.push(4);
        numbers.push(5);
        System.out.println(numbers);
        numbers.pop();
        numbers.pop();
        numbers.pop();
        System.out.println(numbers);
        numbers.push(4);
        numbers.push(6);
        numbers.add(4 , 7);
        System.out.println(numbers);
        numbers.pop();
        System.out.println(numbers);
    }
}