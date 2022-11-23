import RandomProblems.ClassProblem;
import SortingAlgo.BubbleSort;
import SortingAlgo.SelectionSort;
import Trees.AVL.AVLTree;
import Trees.Tree;
import Arrays.Arrays2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{100,20,1,0,10,5,2,3,8};

        //BubbleSort.bubbleSortAsc(arr);
        //BubbleSort.sorter(arr);
        SelectionSort.sorter(arr);

        for(var i:arr){
            System.out.println(i);
        }


    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();

        if(nums.length == 0) return results;

        for(int i=0; i<nums.length; i++){
            int start = nums[i];
            while (i+1 < nums.length && nums[i]+1 == nums[i+1]){
                i++;

                if (start != nums[i]){
                    results.add(""+start+"->"+nums[i]);
                }
                else {
                    results.add(""+start);
                }
            }
        }
        return results;
    }
    private static boolean checkNext(int i, int n){
        if(i+1 == n) return true;
        return false;
    }
    public static int minSubArrayLen(int target, int[] nums) {

        int lp = 0;
        int sum = 0;
        int path = 0;
        int shortestPath = 0;
        for(int i=0; i<nums.length;i++){

            sum += nums[i];

            if(sum < target){
                continue;
            }

            if(sum >= target){
                path = countPath(lp+1,i+1);
                shortestPath = Math.min(path,countPath(lp+1,i+1));
                lp++;
                sum -= nums[lp-1];
            }

        }

        return shortestPath;

    }
    public static int countPath(int l, int r){
        int count = 1;
        for(int i=l; i<r;i++){
            count++;
        }
        return count;
    }
    public static void swap(int x, int y){
        int temp = 0;
        temp = y;
        y = x;
        x = temp;


        //System.out.println( "x : " + x +" y : " +y);
        // 2 3
        // temp 3
    }
    public static int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for(int i=0;i<s.length();i++){
            if( map.get(s.charAt(i)) < map.get(s.charAt(i+1)) && i+1 < s.length() ){
                result -= map.get(s.charAt(i));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }

        return result;

    }
    public static int candy(int[] ratings) {
        int[] candysLR = new int[ratings.length];
        int[] candysRL = new int[ratings.length];
        int candies = 0;

        candysLR[candysLR.length-1] = 1;

        for(int i=1; i<candysRL.length;i++){

            if(ratings[i] > ratings[i-1]){
                candysRL[i] = candysRL[i-1] +1;
            }else{
                candysRL[i] = 1;
            }
        }
        candysLR[candysLR.length-1] = 1;

        for(int i=candysLR.length-2; i>=0;i--){

            if(ratings[i] > ratings[i+1]){
                candysLR[i] = candysLR[i+1] +1;
            }else{
                candysLR[i] = 1;
            }
        }

        for(int i=0; i<ratings.length;i++){
            candies = candies + Math.max(candysLR[i],candysRL[i]);
        }

        return candies;
    }
    public static void moveZeroes(int[] nums) {

        int index = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] != 0){
                int temp = 0;
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
    public static int removeElement(int[] nums, int val) {

        int index = 0;

        for(int i = 0; i<nums.length; i++){ // 3
            if(nums[i]!=val){ // 3 != 3 -> false
                nums[index] = nums[i]; //nums[0] = 3 = 3
                index++;
            }
        }

        return index;
    }


}