//Explicit - Large DataType to Small DataType Conversion
//Implicit - Small DataType to Large DataType Conversion

public class P4_DataTypeConversions {
    public static void main(String[] args) {

        int a = 1;
        long b = a;
        System.out.println("Implicit Type : "+b);

        long c = 2;
        int d = (int) c;
        System.out.println("Explicit Type : "+d);

        int e = 3;
        float f = e;
        System.out.println("Implicit Type : "+f);

        float g = 4f;
        int h =(int) g;
        System.out.println("Explicit Type : "+h);

        float i = 5.678f;
        double j = i;
        System.out.println("Implicit Type : "+j);

        double k = 6.789d;
        float l = (float) k;
        System.out.println("Explicit Type : "+l);

    }
}