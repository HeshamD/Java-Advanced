package ArraysAndStrings;

public class MainA {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2};
        System.out.println(removeDuplicatesFromSortedArray(arr));
    }

    public static int removeDuplicatesFromSortedArray(int[] nums){
        //sorted Array
        //remove duplicates in place >> Meaning this Algorithm has to run on O(N)
        //return the new length, and the inputed array is been modified
        //given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].

        //having two pointers
        // cur, next
        // if cur and next are ==
        // I will shift to the left >> i is the cur and i+1 is the next >> so i+1 = i

            //loop through the array
            // two pointer -> current, n
            // if both equal that means i need to make n[n+1] = n;
            // return the length where there is only values exists

       int l = 1;

       for(int r =1; r< nums.length;r++){
           if(nums[r] != nums[r-1]){ //meaning they are unique value
               nums[l] = nums[r]; // [1,2,3,4,4]
               l++;
           }
       }

       return l;

    }



}
