import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker p1, p2;
    @BeforeEach
    void setUp() {
        p1 = new SalaryWorker("Jon","Smith", "Mr.", 2000, 20.50, 42640.00);
        p2 = new SalaryWorker("Hannah", "Smith", "Mrs.", 1995, 30, 62000);
    }

    @Test
    void setAnnualSalary() {
        p1.setAnnualSalary(45000);
        assertEquals(45000, p1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        p2.calculateWeeklyPay(40);
        assertEquals(1192.31, p2.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        p2.displayWeeklyPay(40);
        assertEquals("You have worked: 40.0 hours for the week. Your weekly pay out of 52 weeks of the year is: $1192.31", p2.displayWeeklyPay(40));
    }
}