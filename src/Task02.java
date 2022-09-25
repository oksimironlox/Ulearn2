import java.util.Scanner;

public class Task02 {
    public static String Type(long num){

        if (num < 128){
            return "byte";
        }
        else if (num < 32768){
            return "short";
        }
        else if (num < 2147483647){
            return "int";
        }
        else {
            return "long";
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        String type = Type(num);
        System.out.println(type);
    }
}
