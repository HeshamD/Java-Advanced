import Collections.Customer;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
//        var c1 = new Customer("a","e1");
//        var c2 = new Customer("b","e2");
//
//        Map<String,Customer> map = new HashMap<>();
//        // the keys are Strings
//        // values are the Customer class DataType
//
//        map.put(c1.getEmail(), c1);
//        map.put(c2.getEmail(), c2);
//
//        var customer = map.get("e1"); // passing the key to get the value
//
//        System.out.println(customer);
//
//        var unknown = new Customer("unknown","");
//        System.out.println(map.getOrDefault("e10",unknown));

        int[] nums = new int[]{1,1,1,2,2,3};
        for(var i:topKFrequent(nums,2)){
            System.out.println(i);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {
        //HashMap and bucket sort

        var map = getFrequencyMap(nums);

        var buckets = new ArrayList<List<Integer>>();

        for(var i = Collections.max(map.values()); i>=0; i--){
            buckets.add(new ArrayList<>());
        }

        for (var key :map.keySet()){
            buckets.get(map.get(key)).add(key);
        }

        var top = new ArrayList<Integer>();
        for (var i=buckets.size()-1;i>=0 && top.size()<k; i--){
            for (var j=0; j<buckets.get(i).size() && top.size()<k;j++){
                top.add(buckets.get(i).get(j));
            }
        }

        return toArray(k,top);

    }

    public static int[] toArray(int k, List<Integer> top){
        var result = new int[k];
        for (var i=0; i< k;i++){
            result[i] = top.get(i);
        }
        return result;
    }

    public static Map<Integer,Integer> getFrequencyMap(int[] nums){
        var map = new HashMap<Integer,Integer>();
        for(var item:nums){
            map.compute(item,(key,value) -> value == null ? 1 : ++value);
        }
        return map;
    }

}
