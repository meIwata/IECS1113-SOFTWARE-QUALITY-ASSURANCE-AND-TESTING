package test_1009;

import java.util.Scanner;

/**
 * BMI 工具類，提供 BMI 計算方法。
 */
public final class BMI {

    /**
     * 私有建構子，避免實例化。
     */
    private BMI() {
        // Utility class, no instance.
    }

    /**
     * 計算 BMI。
     * @param weight 體重（公斤）
     * @param height 身高（公尺）
     * @return BMI 指數
     */
    public static double bmi(final double weight, final double height) {
        return weight / (height * height);
    }

    /**
     * 主程式，從使用者取得輸入並計算 BMI。
     * @param args 命令列參數
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("請輸入體重： ");
            final double weight = scanner.nextDouble();
            System.out.print("請輸入身高： ");
            double height = scanner.nextDouble();
            height = height / 100;
            final double bmi = bmi(weight, height);
            System.out.println(bmi);

        }
    }
}