package test_1002;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length(); // 潛在錯誤
            System.out.println("執行成功");
        }

        // 需要先抓小的在抓大的
        catch (NullPointerException e) {
            System.out.println("捕捉到：NullPointerException");
        }
        catch (Exception e) {
            System.out.println("捕捉到：Exception");
        }
    }
}