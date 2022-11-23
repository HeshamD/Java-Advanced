package Lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
    public static void show(){

        //greet(new ConsolePrinter());

//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//
//            }
//        });

//        greet((String message) -> {
//            System.out.println(message);
//        });


        //How to use the consumer interface
        List<Integer> list = List.of(1,2,3);
        //there are afew ways to iterate through this list

        //Imperative Programming (for, if/else, switch/case)
        // Using Instructions to specify how something should be done
        for(var item:list){
            System.out.println(item);
        }

        //Declarative Programming
        // Here, specify what needs to be done.
        list.forEach((Integer item)->{
            System.out.println(item);
        }); // forEach() method is excepting a consumer object


        List<String> list2 = List.of("a","b","c");

    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }

}
