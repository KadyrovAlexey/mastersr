package Unit03;

public class Task01 {
    public static void main(String[] args) {

        boolean b = canGetDriverLicense(190);
        System.out.println(b);

    }

    static boolean canGetDriverLicense(int age) {
        if(age >= 18){
            return true;
        }
        else {
            return false;
        }

    }
}
