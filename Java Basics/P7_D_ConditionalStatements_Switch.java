import java.util.Scanner;
public class P7_D_ConditionalStatements_Switch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m1, m2, m3;
            System.out.print("Enter marks for English: ");
            m1 = sc.nextInt();
            System.out.print("Enter marks for Kannada: ");
            m2 = sc.nextInt();
            System.out.print("Enter marks for Hindi: ");
            m3 = sc.nextInt();
            System.out.println("Grade for English: " + grade(m1));
            System.out.println("Grade for Kannada: " + grade(m2));
            System.out.println("Grade for Hindi: " + grade(m3));
        }
        public static String grade(int marks) {
            String grade;
            switch (marks / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                case 5:
                    grade = "E";
                    break;
                default:
                    grade = "F";
                    break;
            }
            return grade;
        }
    }