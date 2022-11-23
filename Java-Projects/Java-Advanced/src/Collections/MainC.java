package Collections;

import Generics.GenericList;

public class MainC {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("q");
        list.add("a");

        var iterator = list.iterator();

        while (iterator.hasNext()){
            var current  = iterator.next();
            System.out.println(current);
        }



    }
}
