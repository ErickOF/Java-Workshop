package syntax;

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
public class HelloWorld {
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
     */
    public static void main(String[] args) {
        // print("Hello World!")
        System.out.println("Hello World");
    }
}
