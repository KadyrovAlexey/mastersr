package Unit03;

public class Task05 {
    public static void main(String[] args) {
        System.out.println(getMin(5,4,3));
    }

    static int getMin(int a, int b, int c) {
        if(a <= b && a <= c){
            return a;
        } else if ( b<= a && b <= c) {
            return b;
        }
        else{
            return c;
        }
    }
}
