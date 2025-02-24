import java.util.Scanner;
public class P7_C_ConditionalStatements_Nested_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("A : "+a+", B : "+b+", and C : "+c);
        if(a>=b)
        {
            if(a>=c)
            {
                System.out.println(a+" is Largest");
            }
            else
            {
                System.out.println(c+" is Largest");
            }
        }
        else
        {
            if(b>=c)
            {
                System.out.println(b+" is Largest");
            }
            else
            {
                System.out.println(c+" is Largest");
            }
        }
    }
}
