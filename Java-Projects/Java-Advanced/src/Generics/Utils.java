package Generics;

public class Utils {
    public static int max(int first, int second){
        if(first>second)return first;
        return second;
    }

    public static <T extends Comparable<T>> T max(T first,T second){
        return first.compareTo(second) < 0 ? second: first;
    }

    public static <k,v> void print(k key,v value){
        System.out.println(key + " = " + value);
    }

}
