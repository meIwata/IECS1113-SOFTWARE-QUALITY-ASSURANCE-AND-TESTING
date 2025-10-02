package test_1002;

import java.io.FileNotFoundException;

public class ThrowKeywordDemo {
    public void someMethod() throws FileNotFoundException{
        throw new FileNotFoundException("檔案不存在");
    }

    public static void main(String[] args) {
        ThrowKeywordDemo demo = new ThrowKeywordDemo();
        try {
            demo.someMethod();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}