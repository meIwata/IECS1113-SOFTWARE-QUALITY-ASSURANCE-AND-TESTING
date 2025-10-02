package test_1002;

public class FinallyReturnDemo {
    public static int getValue() {
        int x = 1;
        try {
            System.out.println("Try 開始");
            return x;
        } finally {
            x = 2;
            System.out.println("Finally 執行，x=" + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("返回值: " + getValue());
    }
}