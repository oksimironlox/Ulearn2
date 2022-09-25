import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task10 {
    public static boolean compare(float a, float b, int precision) {

        if(Float.isNaN(a) && Float.isNaN(b)){
            return true;
        }
        else if (Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a + b)) {
            return true;
        }

        a *= Math.pow(10, precision);
        b *= Math.pow(10, precision);

        int g = (int)a; int j = (int)b;

        if(g == j){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }
}
