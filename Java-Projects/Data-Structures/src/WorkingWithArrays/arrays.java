package WorkingWithArrays;

public class arrays {
    public static void main(String[] args) {
        int nums[][] = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
//                {1}
//                {1,3,5}
        };

        System.out.println(searchMatrix(nums,10));
    }

    public static int[] runningSum(int[] nums) {

        for(int i=1; i< nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {


        for(int row=0; row< matrix.length;row++){

                int lastIndex = matrix[row].length-1;
                int columnLastValue = matrix[row][lastIndex];
                if (columnLastValue == target) return true;
                int max = lastIndex;
                int low = 0;


            for(int column = 0; column < matrix[row].length;column++){
                if (columnLastValue < target) break;
                if(columnLastValue > target){
                    //BinarySearch

                    int mid = (max + low) /2;
                    int midValue = matrix[row][mid];
                    if(midValue == target) return true;
                    if(midValue > target) {
                        max = mid-1;
                    }
                    if(midValue < target){
                        low = mid+1;
                    }
                }
            }


        }
        return false;
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = piles.length-1;

        int res = r;

        while (l <= r){
            int k = (l+r)/2;
            int hours = 0;

            for(var pile : piles){
                 hours += Math.ceil(pile/k);
            }

            if(hours <= h){
                res = Math.min(res,k);
                r = k-1;
            }else {
                l = k+1;
            }

        }
        return res;
    }


}
