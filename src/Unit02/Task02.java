package Unit02;

public class Task02 {
    public static String solution(String input) {

        long number = Long.parseLong(input);

        if(number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE)
        {
            return "byte";
        }
        else if(number <= Short.MAX_VALUE && number >= Short.MIN_VALUE)
        {
            return "shotr";
        }
        else if(number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE)
        {
            return "int";
        }
        else
        {
            return "long";
        }
    }

    public static void main(String[] args) {
        String result = solution("2500000000");
        System.out.println(result);
    }

}
