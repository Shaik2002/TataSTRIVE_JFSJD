//boolean - 1 bit - [true,false]
//Char - 2 byte - ['A' 'a']
//byte - 1 byte - [-128 to 127]
//short - 2 byte - [-32,768 to 32,767]
//int - 4 byte - [1,2,3,.......]
//long - 8 byte - [1,2,3,4,5,6,....]
//float - 4 byte - [Single Precision]
//double - 8 byte - [Double Precision]

public class P2_DataTypes {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        char b = 'A';
        System.out.println(b);
        boolean c = true;
        System.out.println(c);
        long d = 123456L;
        System.out.println(d);
        double e = 1.2345d;
        System.out.println(e);
        float f = 1.23f;
        System.out.println(f);
        byte g = -12;
        System.out.println(g);
        short h = -12345;
        System.out.println(h);
    }
}