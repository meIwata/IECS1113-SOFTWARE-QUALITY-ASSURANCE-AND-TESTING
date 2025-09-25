package test_0918;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BreakpointDemo {
    public static void main(String[] args) {
        computeArea();
    }

    public static void computeArea() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter diameter: ");
//        int diameter = input.nextInt();

        int diameter = 11;

        double area = Math.PI * Math.pow(diameter / 2, 2);
        double x = Math.PI * diameter;
        System.out.println(diameter);
        System.out.println(area);
        System.out.println(x);
    }
}