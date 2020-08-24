package data_structure;

import java.util.LinkedList;

public class DynamicDataStructure {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<Integer>();
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
