package oop;

public class Main {
    public static void main(String[] args) {
        Father father = new Father("Erick", (byte) 20, 30);

        System.out.println(father.getName());

        father.setName("Erick");

        System.out.println(father.getName());

        Child child1 = new Child("Erick Child", (byte) 2, 31);

        System.out.println(child1.getName());
        child1.cry();

        Child child2 = new Child("Erick Child2", (byte) 3, 32);

        System.out.println(child2.getName());
        System.out.println(child1.getName());

        System.out.println(child1.enfermedad);
        System.out.println(child2.enfermedad);

        child2.enfermedad = "Gripe fuerte";

        System.out.println(child1.enfermedad);
        System.out.println(child2.enfermedad);

        child2.setName("Erick2");

        System.out.println(child2.getName());
        System.out.println(child1.getName());

        father.eat();
    }
}
