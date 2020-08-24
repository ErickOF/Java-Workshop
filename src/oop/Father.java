package oop;

public class Father extends AbstractFather {
    // Attributes
    private String name = "";
    private byte age = 0;
    private int idCard = 0;

    // Constants
    public final static int ID = 100;

    // Statics
    public static String enfermedad = "Gripe";

    /**
     * Default constructor.
     */
    public Father() { }

    /**
     *
     * @param name
     * @param age
     * @param idCard
     */
    public Father(String name, byte age, int idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }

    @Override
    public void sayName() {
        System.out.println("My name is " + this.name);
    }

    @Override
    public String toString() {
        return super.toString() + "...";
    }
}
