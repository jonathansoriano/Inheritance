import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
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

        //We get items from an arraylist with .get() method.


        ArrayList<Double> weeklyHours = new ArrayList<>(); // The loop the lab wanted to loop through the all the weeks given the hours worked.
        weeklyHours.add(40.0);
        weeklyHours.add(50.0);
        weeklyHours.add(40.0);

        /*
        so the for loop works like this: for every time the outer for loop executes,
         the nested loop goes through it's whole iteration. Then the outer loop checks
          to see if it can iterate another time unless it doesn't meet the loops condition
         */

        System.out.printf("%50s%40s\n","Name", "Weekly Pay");
        for (int x = 0; x < weeklyHours.size(); x++){
            System.out.println("Week " + (x+ 1) + "\nHours: " + weeklyHours.get(x)); //This part of the for loop goes one iteration (loop)
            for (Worker worker: workers){ // nested loop goes through it's whole iteration and then returns back to the outer loop
                                        // worker variable is a representation of an item(object) in the "workers" array list.
                System.out.printf("%50s%40f\n",worker.fullName(), worker.calculateWeeklyPay(weeklyHours.get(x)));


            }

        }



    }
}
