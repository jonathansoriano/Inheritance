public class SalaryWorker extends Worker {

    private double annualSalary = 0.0;

    public SalaryWorker(String firstname, String lastName, String title, int yob, double hourlyPayRate, double annualSalary) {
        super(firstname,lastName,title,yob,hourlyPayRate);
        this.annualSalary = annualSalary;//
    }
    //Getter and Setter Methods

    /**
     * This method retrieves the annualSalary of the SalaryWorker object
     * @return - returns the annualSalary type double for the salary worker.
     */
    public double getAnnualSalary(){
        return annualSalary;
    }

    /**
     * This method allows you to change the annualSalary of the SalaryWorker object
     * @param annualSalary - we need a new annualSalary type double to change annualSalary.
     */
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

    /**
     * This method calculates the weekly pay of a salary worker.
     * @param hoursWorked - (non-functional) We need the hours worked for the worker just to prove you were on the clock/on site.
     * @return - returns the weekly pay/ a fraction of the annual salary.
     */
    @Override
    public double calculateWeeklyPay(double hoursWorked) { // Parameter is just to log how many
                                                        // hours you worked for the week, but as Salary worker regardless
                                                        // how many hours you work you have a fix weekly pay.
                                                        //We do nothing with the parameter input here. Just for show.

        double weeklyPay = annualSalary / 52.0; // divide what the user enters for annual pay by 52 weeks(how many weeks in year)

        // Round to 2 decimal places
        weeklyPay = Math.round(weeklyPay * 100.0) / 100.0;
        return weeklyPay;
    }

    /**
     * This method prints out how many hours you clocked in that week and how much you got paid for that week.
     * @param hoursWorked - used to print out how many hours you worked that week
     * @return - prints out how many hours you clocked in that week and how much you got paid for that week.
     */
    @Override
    public String displayWeeklyPay(double hoursWorked) {

        double weeklyPay = annualSalary / 52.0;
        return String.format("You have worked: %.1f hours for the week. Your weekly pay out of 52 weeks of the year is: $%.2f",
                hoursWorked, weeklyPay);
    }


}
