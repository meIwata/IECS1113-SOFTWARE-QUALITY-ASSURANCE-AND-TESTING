package test_1016;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add() {
        Calculator calculator = new Calculator();
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
                    assertEquals(3, calculator.add(1, 2));
                },
                () -> {
                    System.out.println("pn");
                    assertEquals(0, calculator.add(1, -1));
                },
                () -> {
                    System.out.println("np");
                    assertEquals(0, calculator.add(-1, 1));
                },
                () -> {
                    System.out.println("nn");
                    assertEquals(-2, calculator.add(-1, -1));
                }
        );
    }

//    @Test
//    void add_pp() {
//        Calculator calculator = new Calculator();
//        int actual = calculator.add(1, 2);
//        assertEquals(3, actual);
//    }
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