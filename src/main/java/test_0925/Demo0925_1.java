package test_0925;

public class Demo0925_1 {
    public static void main(String[] args) {
        int x = 1;
        int y = square(x); // 方法名稱修正
        assert y >= 0;
        System.out.println(y);
    }

    public static int square(int x) { // 加上參數型別
        return x * x; // 回傳 x 的平方
    }
}
