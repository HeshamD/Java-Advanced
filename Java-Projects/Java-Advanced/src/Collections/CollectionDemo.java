package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> c1 = new ArrayList<>();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        for(var item : c1){
            System.out.println(item); // this works too
        }

        System.out.println(c1); // this works

        // if we need to add items in one go

        Collections.addAll(c1,"1","2","3");
        System.out.println(c1); // this works

        // Operations of the collection Interface

        //converting to array

        String[] c1StringArray = c1.toArray(new String[0]);


    }
}
