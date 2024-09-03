import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker p1, p2;
    @BeforeEach
    void setUp() {
        p1 = new Worker("Tom", "Wulf", "Mr.", 1970, 22.50);
        p2 = new Worker("Jon", "Sanjuan", "Mr.", 2000, 21.50);
    }

    @Test
    void setHourlyPayRate() {
        p1.setHourlyPayRate(12.00);
        assertEquals(12.00, p1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() { //1420 regular pay + 532.5 otpay = 1952.5
        p1.calculateWeeklyPay(50.00);
        assertEquals(1952.5, p1.calculateWeeklyPay(50.00));
    }

    @Test
    void displayWeeklyPay() {
        p1.displayWeeklyPay(45.00);
        assertEquals("Regular Hours Worked: 40.0. Regular hours pay: 900.0. Overtime Hours Worked: 5.0. Overtime hours pay: 168.75 Total Pay: 1068.75", p1.displayWeeklyPay(45.00));
    }
}