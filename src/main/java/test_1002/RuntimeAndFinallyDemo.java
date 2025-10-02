package test_1002;

public class RuntimeAndFinallyDemo {
    public static void main(String[] args) {
        int result = 0;
        try {
            int[] numbers = {10};
            System.out.println("嘗試執行除法");
            result = numbers[0] / 0; // 潛在錯誤
            System.out.println("除法完成");
        } catch (ArithmeticException e) {
            System.out.println("捕捉到：Dive by zero");
        } finally {
            System.out.println("Finally 區塊執行");
        }
        System.out.println("Result: " + result);
    }
}