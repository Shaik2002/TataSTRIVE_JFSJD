public class P21_CommandLine_Arguments {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        int a , b;
        a = Integer.parseInt(args[4]);
        b = Integer.parseInt(args[5]);
        System.out.println("Addition of 2 Numbers is : " +(a + b));
        String fname = args[6];
        String lname = args[7];
        System.out.println("My Name is : "+fname+lname);
    }
}