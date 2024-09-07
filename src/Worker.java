public class Worker extends Person {

    private double hourlyPayRate = 0.0;

    public Worker(String firstname, String lastName, String title, int yob, double hourlyPayRate){
        super(firstname,lastName,title, yob);
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * This method retrieves the hourlyPayRate of the Worker object
     * @return - returns the hourlyPayRate of Worker Object.
     */
    public double getHourlyPayRate(){
        return hourlyPayRate;
    }

    /**
     * This methods allows you to change the hourlyPayRate of the Worker Object.
     * @param hourlyPayRate - you need a hourlyPayRate type double to change the value of hourlyPayRate.
     */
    public void setHourlyPayRate(double hourlyPayRate){ // You need to make hourlyPayRate equal to the new "payRate";
        this.hourlyPayRate = hourlyPayRate; // Otherwise you will still get the original hourlyRate from the constructor.
    }

    /**
     * This method calculates the Worker's weekly pay based on weekly hours.
     * @param hoursWorked - you need to enter hours worked (type double) to do the calculations
     * @return - returns weekly pay for Worker object.
     */
    public double calculateWeeklyPay(double hoursWorked){
        double weeklyPay = 0.0;

        if (hoursWorked <= 40.0){
            weeklyPay = hourlyPayRate * hoursWorked;
        } else {
            double overtimeHours = hoursWorked - 40;
            double overtimePay;
            double regularPay;

            overtimePay = (1.5 * hourlyPayRate) * overtimeHours;
            regularPay = 40 * hourlyPayRate;
            weeklyPay =  overtimePay + regularPay;
        }
        weeklyPay = Math.round(weeklyPay * 100.0) / 100.0;

        return weeklyPay;

    }

    /**
     * This method displays how many hours worked and weekly pay for the Worker object.
     * @param hoursWorked - you need to enter hours worked (type double) to do the calculations
     * @return - returns hours worked and weekly pay for the Worker object.
     */
    public String displayWeeklyPay(double hoursWorked){ // Need to display regular pay and overtime pay in return statement.
        double weeklyPay = 0.0;
        String msg = "";
        if (hoursWorked <= 40.0){
            weeklyPay = hourlyPayRate * hoursWorked;
            msg = "Regular Hours Worked: " + hoursWorked + "." + "Regular hours pay: " + weeklyPay + "." + "\n\nOvertime Hours Worked: " + 0.0 + "." + "Overtime hours pay: " + 0.0;
        } else {

            double overtimeHours = hoursWorked - 40;
            double regularHours = hoursWorked - overtimeHours;
            double overtimePay = (1.5 * hourlyPayRate) * overtimeHours;
            double regularPay = regularHours * hourlyPayRate;
            weeklyPay = regularPay + overtimePay;

            msg = "Regular Hours Worked: " + regularHours + "." + " Regular hours pay: " + regularPay + "." + " Overtime Hours Worked: " + overtimeHours + "." + " Overtime hours pay: " + overtimePay + " Total Pay: " + weeklyPay;

        }
        return msg;
    }


}
