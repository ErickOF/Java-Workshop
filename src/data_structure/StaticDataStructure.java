package data_structure;

import class_structure.ClassStructure;

public class StaticDataStructure {
    public static void main(String[] args) {
        double[] doubleArray = {10d, 11d, 13d};

        doubleArray[0] = 12d;

        ClassStructure classStructure = new ClassStructure();
        classStructure.printArray(doubleArray);

        String[] names = {"Erick", "Andres"};

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.pow(i, 2);
        }

        classStructure.printArray(numbers);
    }
}
