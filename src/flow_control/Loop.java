package flow_control;

public class Loop {
    public void whileLoop() {
        int i = 0;

        while (i < 100) {
            System.out.println("i = " + i);
            i += 10;
        }
    }

    public void forLoop() {
        // for i in range(10, 100 + 1, 10)
        // i++;
        // i--;
        for (int i = 10; i <= 100; i += 10) {
            System.out.println("i = " + i);
        }
    }

    public void forEachLoop() {
        int[] numbers = {10, 100, 1000, 10000};

        // for num in numbers
        for (int num: numbers) {
            System.out.println("Num = " + num);
        }

        /*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        */
    }

    public static void main(String[] args) {
        Loop loop = new Loop();
        System.out.println("While");
        loop.whileLoop();

        System.out.println();

        System.out.println("For");
        loop.forLoop();

        System.out.println();

        System.out.println("For Each");
        loop.forEachLoop();
    }
}
