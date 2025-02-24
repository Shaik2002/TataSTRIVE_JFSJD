//Arithmetic Operators [+,-,*,/,++,--,%][(++a Increment,Assign)(a-- Assign,Decrement)]
//Relational Operators [==,!=,>,<,>=,<=]
//Logical Operators [&&(and),||(or),!(not)]
//Assignment Operators [=,+=,-=,*=,/=,%=,<<=,>>=,&=,^=]
//BitWise Operators [&(and),|(or),~(Negation),^(XOR),<<(LeftShift),>>(RightShift)]

public class P5_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : " +(a-b));
        System.out.println("Multiplication : " +(a*b));
        System.out.println("Division : " +(b/a));
        System.out.println("Increment : " +(++a));
        System.out.println("Decrement : " +(--a));
        System.out.println("Modulus : " +(a%b));

        int c = 25;
        int d = 35;
        System.out.println("Is Equal to : "+(c==d));
        System.out.println("Is Not Equal to : "+(c!=d));
        System.out.println("Is Greater Than : "+(c>d));
        System.out.println("Is Lesser than : "+(c<d));
        System.out.println("Is Greater Than or Equal To : "+(c>=d));
        System.out.println("Is Lesser Than or Equal To : "+(c<=d));

        int e = 12;
        int f = 48;
        System.out.println("AND Operator : "+((e==f)&&(e>f)));
        System.out.println("OR Operator : "+((e<=f)||(e==f)));
        System.out.println("NOT Operator : "+(!(e<f)));

        int g = 22;
        int h = 99;
        System.out.println("Bitwise AND : "+(g&h));
        System.out.println("Bitwise OR : "+(g|h));
        System.out.println("XOR : "+(g^h));
        System.out.println("Negation : "+(~h));
        System.out.println("LeftShift : "+(g<<3));
        System.out.println("RightShift : "+(g>>3));

        int i = 10;
        System.out.println("A : "+(i+=10));
        System.out.println("A : "+(i-=10));
        System.out.println("A : "+(i*=10));
        System.out.println("A : "+(i/=10));
        System.out.println("A : "+(i%=10));
        System.out.println("A : "+(i<<=10));
        System.out.println("A : "+(i>>=10));
        System.out.println("A : "+(i&=10));
        System.out.println("A : "+(i^=10));
    }
}