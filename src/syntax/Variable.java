package syntax;

public class Variable {
    public static void main(String[] args) {
        // data-type name-var = value;
        // var name must be in camel case notation

        // size: 1 byte. Stores whole numbers from -128 to 127.
        byte byteNumber = 10;
        // size: 4 bytes. Stores whole numbers from -2,147,483,648 to 2,147,483,647.
        int intNumber = 200898;
        // size: 8 bytes. Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        long longNumber = 1200010293223598L;
        // size: 4 bytes. Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits.
        float floatNumber = 20.5f;
        // size: 8 bytes. Stores fractional numbers. Sufficient for storing 15 decimal digits.
        double doubleNumber = 10e15d;
        // size: 2 bytes. Stores a single character/letter or ASCII values.
        char letter = 'a';
        // size: 2 bytes. Stores whole numbers from -32,768 to 32,767.
        String string = "Hello";
        // size: 1 bit. Stores true or false values.
        boolean bool = true; // false

        int number;
        number = 100;

        // Constant
        // Must be completely written in upper case.
        final double PI = 3.1415926535897932384626433832795028841971693993751058d;

        // Float to integer
        int float2int = (int) floatNumber;
        // Int to float
        float int2float = (float) intNumber;

        // int to string (?)
        //String int2string = (String) intNumber;
        String int2string = String.valueOf(intNumber);

        System.out.println(byteNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(letter);
        System.out.println(string);
        System.out.println(bool);
        System.out.println(number);
        System.out.println(PI);
        System.out.println(float2int);
        System.out.println(int2float);
        System.out.println(int2string + " " + int2string.getClass());
    }
}
