package flow_control;

public class Conditional {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        if (num1 > num2) {
            System.out.println("Num1 > Num2");
        } else if (num1 < num2) {
            System.out.println("Num1 < Num2");
        } else {
            System.out.println("Num1 == Num2");
        }

        if (num1 == num2) {
            System.out.println("Num1 == Num2");
        }
        if (num1 != num2) {
            System.out.println("Num1 != Num2");
        }

        if (!(num1 == num2)) {
            System.out.println("Not (Num1 == Num2)");
        }

        if (num1 == 20 && num2 == 30) {
            System.out.println("Num1 == 20 and Num2 == 30");
        }

        if (num1 == 20 || num2 == 30) {
            System.out.println("Num1 == 20 or Num2 == 30");
        }
    }
}
