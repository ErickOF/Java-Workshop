package try_catch;

public class TryCatch {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;

        try {
            double result = num1 / num2;

            System.out.println(result);
        } catch (ArithmeticException error) {
            System.out.println("There is an error!");
            System.out.println(error);
            error.printStackTrace();
        }
    }
}
