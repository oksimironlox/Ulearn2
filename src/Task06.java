import java.util.Scanner;

public class Task06 {
    public static int digitCounter(int a, int b){
        int sum = a + b; int count = 0;
        while(sum > 0){
            count++;
            sum /= 10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();

        System.out.print("b = ");
        int b = in.nextInt();

        System.out.print(digitCounter(a, b));
    }
}
