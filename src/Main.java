import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Worker Jon = new Worker("Jon", "Sanjuan", "Mr." , 2000, 22.50);
        String msg = "";


        msg = Jon.displayWeeklyPay(45.0);
        System.out.println(msg);


    }
}