package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class RevStream {
    public static void show(){
        int[] arr = new int[]{1,2,3,4,5,6};
        Arrays.stream(arr)
                .forEach( item -> System.out.println(item));
        System.out.println("______________________");


        // Arbitrary number of objects
        var s = Stream.of(1,2,4,5);
        s.forEach(n-> System.out.println(n));

        System.out.println("______________________");

        Collection<Integer> integersCollection = new ArrayList<>();
        integersCollection.add(1);
        integersCollection.add(2);
        integersCollection.add(3);

        integersCollection.stream()
                .forEach(item -> System.out.println(item));

        System.out.println("______________________");

        var str = Stream.generate(() -> Math.random())
                .limit(3);
        str.forEach(item -> System.out.println(item));

        System.out.println("______________________");

        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("bag",5));
        productsList.add(new Product("shoe",10));
        productsList.add(new Product("bottle",2));

        productsList.stream()
                .map(product -> product.getName())
                .forEach(name -> System.out.println(name));

        System.out.println("______________________");

        productsList.stream()
                .filter(product -> product.getPrice()<10)
                .forEach(product -> System.out.println(product));

    }
}
