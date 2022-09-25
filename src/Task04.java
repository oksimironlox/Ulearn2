import java.util.Scanner;

public class Task04 {
    public static double calculate(int a, int b, String operand){
        switch(operand){
            case "/":
                return a/b;
            case "*":
                return a*b;
            case "-":
                return a-b;
            case"+":
                return a+b;
            default:
                System.out.print("Ошибка");
                break;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();

        System.out.print("b = ");
        int b = in.nextInt();

        System.out.print("operand = ");
        String operand = in.next();

        System.out.println(calculate(a,b,operand));
    }
}
