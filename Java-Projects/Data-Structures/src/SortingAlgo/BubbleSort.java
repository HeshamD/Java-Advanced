package SortingAlgo;

public class BubbleSort {
    public static void bubbleSortAsc(int[] arr){
        boolean isSorted;

        for(int i=0; i<arr.length;i++) {
            isSorted = true;
            for (int j = 1; j < arr.length-i; j++)
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSorted = false; //coz at this case my assumption was wrong
                }
            if (isSorted) return;
        }

    }
    public static void swap(int[] arr,int index1,int index2){
        var temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sorter(int[] arr){
        for(int i=0; i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }


}
