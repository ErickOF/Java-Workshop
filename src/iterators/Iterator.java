package iterators;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<String>();

        linkedList.add("Hola");
        linkedList.add("Adios");
        linkedList.add("Manzana");
        linkedList.add("Naranja");

        for (Object element: linkedList) {
            System.out.println(element);
        }

        System.out.println();

        ListIterator<String> listIterator = linkedList.listIterator(0);

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();

        ListIterator<String> listIterator2 = linkedList.listIterator(0);

        for (; listIterator2.hasNext();) {
            System.out.println(listIterator2.next());
        }
    }
}
