package class_structure;

/**
 * Class structure.
 *
 * access-modifier class ClassName { }
 *
 * access modifiers:
 *     public - Everyone can access.
 *     without (private-package, default) - Only in the same package.
 *
 * Class name must start with upper case.
 */
public class ClassStructure {
    /**
     * Method structure.
     *
     * access-modifier <static-keyword> return-type name(type0 arg0, type1 arg1, type2 arg2, ...) { }
     *
     * access modifiers:
     *     public - Everyone can access.
     *     protected - Only class, package and subclass.
     *     without (default) - Class and package.
     *     private - Class.
     *
     * "static" means that the method/attribute belongs to the class and not an object of the class.
     *
     * return-type could be any of the data types learnt before.
     */
    public static void staticPrint(Object data) {
        System.out.println(data);
    }

    /**
     * This method sum to integer numbers.
     *
     * @param a - first number.
     * @param b - second number.
     *
     * @return result to add a and b.
     */
    public int sum(int a, int b) {
        // Returns
        return a + b;
    }

    private double sum(double[] data) {
        double result = 0;

        // for i in range(0, len(data), 1)
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }

        return result;
    }

    public double average(double[] data) {
        return sum(data) / data.length;
    }

    public void changeArrayValue(double[] data, int i, double value) {
        data[i] = value;
    }

    public void printArray(double[] data) {
        // for num in data
        for (Object num: data) {
            System.out.println(num);
        }

        System.out.println();
    }
}
