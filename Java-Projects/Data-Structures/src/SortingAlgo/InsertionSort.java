package SortingAlgo;

public class InsertionSort {
    public static void insertionSort(int[]arr){
        for (int i=1; i<arr.length;i++){
            var current = arr[i];
            //another loop to lookup for all the greater items
            //and if they are greater shift them to the right
            var j = i-1;
            while (j >=0 && arr[j] > current){ // then shift to the right
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
