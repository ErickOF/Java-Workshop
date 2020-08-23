package class_structure;

public class Main {
    public static void main(String[] args) {
        ClassStructure.staticPrint(20);
        ClassStructure.staticPrint(20.5f);
        ClassStructure.staticPrint("\n");

        // Creating a class instance
        ClassStructure classStructure = new ClassStructure();

        // Add to numbers
        int sumResult = classStructure.sum(20, 10);

        System.out.println(sumResult);
        System.out.println(classStructure.sum(20, 20));
        ClassStructure.staticPrint("\n");

        // Working with an array
        double[] data = {1.0d, 2.0d, 3.0d};
        System.out.println("Avg: " + classStructure.average(data) + "\n");

        // Print array
        classStructure.printArray(data);

        // Changing array value
        classStructure.changeArrayValue(data, 0, 100d);
        classStructure.printArray(data);
    }
}
