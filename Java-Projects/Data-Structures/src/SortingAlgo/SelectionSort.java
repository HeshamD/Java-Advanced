package SortingAlgo;

public class SelectionSort {
    public static void sorter(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            //this array to get the minimum value in the array
            for(int j=i; j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swaper(arr,minIndex,i);
        }
    }
    public static void swaper(int[] arr,int IndexMin, int IndexValue){
        int temp = arr[IndexValue];
        arr[IndexValue] = arr[IndexMin];
        arr[IndexMin] = temp;
    }
    

}
