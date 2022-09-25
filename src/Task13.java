import java.util.Scanner;

public class Task13 {
    public static char Convert(char l){
        return (char)(int)(l-32);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Letter = ");
        char l = in.next().charAt(0);

        System.out.print(Convert(l));
    }
}
