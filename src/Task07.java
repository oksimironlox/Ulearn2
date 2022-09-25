import java.util.Scanner;

public class Task07 {
    public static int countTents(int n, int m, int k){
        return (n/k) * (m/k);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("N = ");
        int n = in.nextInt();

        System.out.print("M = ");
        int m = in.nextInt();

        System.out.print("K = ");
        int k = in.nextInt();

        System.out.print(countTents(n,m,k));
    }
}
