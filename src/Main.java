import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        double weekOnePay = 0.0;
        double weekTwoPay = 0.0;
        double weekThreePay = 0.0;
        Worker todd = new Worker("Tod", "Smith", "Mr.", 1990, 20.0);
        Worker avery = new Worker("Avery", "Jones", "Mrs.", 1991, 25.00);
        Worker james = new Worker("James", "Mario", "Mr.", 1992, 30.00);

        SalaryWorker nicole = new SalaryWorker("Nicole", "Lanae", "Ms.", 1993, 35, 72800);
        SalaryWorker dan = new SalaryWorker("Dan", "Wise", "Mr.", 1994, 35, 72800);
        SalaryWorker kate = new SalaryWorker("Kate", "Oehler", "Mrs.", 1995, 40, 83200);

        workers.add(kate);
        workers.add(dan);
        workers.add(nicole);
        workers.add(james);
        workers.add(avery);
        workers.add(todd);

        //Arraylist for the every week's hours
        ArrayList<Double> weeklyHours = new ArrayList<Double>();
        weeklyHours.add(40.0);
        weeklyHours.add(50.0);
        weeklyHours.add(40.0);

        //This was my original way of printing out each worker's weekly pay every week.
        System.out.printf("%50s%40s\n","Name", "Weekly Pay");
        for (int x = 0; x < weeklyHours.size(); x++){
            System.out.println("Week " + (x+ 1) + "\nHours: " + weeklyHours.get(x));
            System.out.printf("%50s%40f\n", kate.fullName(), kate.calculateWeeklyPay(weeklyHours.get(x)));
            System.out.printf("%50s%40f\n", dan.fullName(), dan.calculateWeeklyPay(weeklyHours.get(x)));
            System.out.printf("%50s%40f\n", nicole.fullName(), nicole.calculateWeeklyPay(weeklyHours.get(x)));
            System.out.printf("%50s%40f\n", james.fullName(), james.calculateWeeklyPay(weeklyHours.get(x)));
            System.out.printf("%50s%40f\n", avery.fullName(), avery.calculateWeeklyPay(weeklyHours.get(x)));
            System.out.printf("%50s%40f\n", todd.fullName(), todd.calculateWeeklyPay(weeklyHours.get(x)));

        }
    }
}
