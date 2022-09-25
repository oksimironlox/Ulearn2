import java.util.Scanner;

public class Task14 {
    public static int Reverse(int num){
        String rev = new StringBuilder(Integer.toString(num)).reverse().toString();
        int x = Integer.parseInt(rev);
        return x;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Number = ");
        int n = in.nextInt();

        System.out.print(Reverse(n));
    }
}
