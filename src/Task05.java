import java.util.Scanner;

public class Task05 {
    public static boolean parityCheck(int num){
        boolean flag = true;
        while(num > 0){
            if((num % 10) % 2 != 0){
                flag = false;
            }
            num /= 10;
        }
        return flag;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();

        System.out.print(parityCheck(a));
    }
}
