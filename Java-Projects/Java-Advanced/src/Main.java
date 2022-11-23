import Collections.CollectionDemo;
import Collections.Customer;
import Generics.GCMatric;
import Generics.GMatric;
import Generics.Library.Book;
import Generics.Matrix;
import Generics.Utils;
import Collections.EmailComparator;
import Lambdas.LambdasDemo;
import Streams.RevStream;
import Streams.StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Matrix m  = new Matrix(3,2);
//        m.setValue(0,0,1);
//        m.setValue(0,1,2);
//        m.setValue(1,0,3);
//        m.setValue(1,1,4);
//        m.setValue(2,0,5);
//        m.setValue(2,1,6);
//
//        System.out.println(m.getValue(2,0));

//        GMatric m = new GMatric<Integer>(3,2);
//        m.setValue(0,0,1);
//        m.setValue(0,1,2);
//        m.setValue(1,0,3);
//        m.setValue(1,1,4);
//        m.setValue(2,0,5);
//        m.setValue(2,1,6);
//
//        System.out.println(m.getValue(2,0));

//        GCMatric m = new GCMatric<String>(3,2); // Here u can see an error with passing String as a dataType coz this generic class has constraint for any numbers
//        m.setValue(0,0,1);
//        m.setValue(0,1,2);
//        m.setValue(1,0,3);
//        m.setValue(1,1,4);
//        m.setValue(2,0,5);
//        m.setValue(2,1,6);
//
//        System.out.println(m.getValue(2,0));

//        var max = Utils.max(1,3);
//        System.out.println(max);

//        Book ch1 = new Book("c1","28");
//
//        System.out.println(ch1.playAudio());
//        System.out.println(ch1.readScripts());

        //CollectionDemo.show();

//        List<Customer> customersList = new ArrayList<>();
//        Collections.addAll(customersList,new Customer("a","e2"),new Customer("b","e3"),new Customer("c","e1"));
//
//        //Collections.sort(customersList); //we need to implement the comparable interface in the customer class
//
//        Collections.sort(customersList,new EmailComparator());
//        System.out.println(customersList);

        //StreamDemo.show();
        RevStream.show();

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();
        String result = "";

        for(int i=0; i<nums.length; i++){
            if(!checkNext(nums[i],nums[i+1])){
                results.add(String.valueOf(nums[i]));
            }else {
                result = String.valueOf(nums[i]) + "->" + String.valueOf(nums[i+1]);
                results.add(result);
            }
        }
        return results;
    }

    private static boolean checkNext(int i, int n){
        if(i+1 == n) return true;
        return false;
    }
}