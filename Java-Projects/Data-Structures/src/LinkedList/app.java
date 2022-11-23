package LinkedList;

import java.util.LinkedList;

public class app {
    public static void main(String[] args) {
        var l1 = new LinkedList2();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);

        //System.out.println(l1.indexOf(4));
        //System.out.println(l1.contains(1));
        l1.removeFirst();
        System.out.println(l1.contains(1));
        l1.print();
    }
}
