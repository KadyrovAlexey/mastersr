package Unit02;

public class Task13 {
    public static char toUpperCase(char c) {

        if (c >= 'a' && c <= 'z') {

            return (char) (c - 32);
        }

        return c;
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);

    }
}
