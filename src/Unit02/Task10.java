package Unit02;

public class Task10 {
    public static boolean compare(float a, float b, int precision) {
        if (a !=a && b != b) {
           return true;
        }

        if(a == Float.POSITIVE_INFINITY || a == Float.NEGATIVE_INFINITY
        || b == Float.POSITIVE_INFINITY || b == Float.NEGATIVE_INFINITY){
            return a == b;
        }
        float epsilon = 1.0f;
        for(int i = 0; i < precision; i++) {
            epsilon = epsilon / 10.0f;
        }
        float difference = a - b;
        if (difference < 0) {
            difference = -difference;
        }
        return difference <= epsilon;
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
