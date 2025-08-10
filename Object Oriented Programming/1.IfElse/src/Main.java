import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int week;

        String weekString = "Sat";

        switch (weekString)
        {

            case "mon": week = 1;
                break;

            case "Tue": week = 2;
                break;
            case "Wed": week = 3;
                break;

            case "Thur": week = 4;
                break;
            case "Fri": week = 5;
                break;
            case "Sat": week = 6;
                break;
            default:
                week = 100;
                break;
        }

        System.out.print("Week no : " + week);


    }
}