package test_1016;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void init(){
        calculator = new Calculator();
        System.out.println("Before Each");
    }

    @AfterEach
    void tearDown(){
        System.out.println("After Each");
        calculator = null; // 釋放資源
    }

    @Test
    void add() {

//        Calculator calculator = new Calculator();
//        System.out.println("pp");
//        assertEquals(2, calculator.add(1, 2));
//        System.out.println("pn");
//        assertEquals(0, calculator.add(1, -1));
//        System.out.println("np");
//        assertEquals(0, calculator.add(-1, 1));
//        System.out.println("nn");
//        assertEquals(-2, calculator.add(-1, -1));

        assertAll("Test add()",
                () -> {
                    System.out.println("pp");
                    assertEquals(3, calculator.add(1, 2), "add ERROR");
                },
                () -> {
                    System.out.println("pn");
                    assertEquals(0, calculator.add(1, -1), "add pn ERROR");
                },
                () -> {
                    System.out.println("np");
                    assertEquals(0, calculator.add(-1, 1), "add np ERROR");
                },
                () -> {
                    System.out.println("nn");
                    assertEquals(-2, calculator.add(-1, -1), "add nn ERROR");
                }
        );
    }

    @Test
    void add_pp() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(1, 2);
        System.out.println("add_pp");
        assertEquals(3, actual);
    }
//    @Test
//    void add_pn() {
//        Calculator calculator = new Calculator();
//        int actual = calculator.add(1, -1);
//        assertEquals(0, actual);
//    }
//    @Test
//    void add_np() {
//        Calculator calculator = new Calculator();
//        int actual = calculator.add(-1, 1);
//        assertEquals(0, actual);
//    }
//    @Test
//    void add_nn() {
//        Calculator calculator = new Calculator();
//        int actual = calculator.add(-1, -1);
//        assertEquals(-2, actual);
//    }
}