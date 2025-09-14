package Unit03;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                return "Зима";
            case 3:
            case 4:
            case 5:
                return "Весна";
            case 6:
            case 7:
            case 8:
                return "лето";
            case 9:
            case 10:
            case 11:
                return "Осень";
            default:
                return "";
        }

    }
}
