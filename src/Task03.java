import java.util.Scanner;

public class Task03 {
    public static int getMetreFromCentimetre(int centimetre){
        return centimetre/100;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int centimetre = in.nextInt();
        System.out.println(getMetreFromCentimetre(centimetre));
    }
}
