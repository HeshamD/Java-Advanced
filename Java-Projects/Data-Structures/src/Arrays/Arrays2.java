package Arrays;

public class Arrays2 {
    private int[] items;
    private int count;

    public Arrays2(int size){
        this.items = new int[size];
    }

    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count*2];
            for(int i=0; i<count;i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count] = item;
        count++;
    }

    public void removeAt(int index){ // [1,2,6,3,4]

        if(index >= count || index < 0)throw new IllegalStateException();

        //shifing from right to left
        for(int i = 0; i<items.length;i++){
            if(i==index){
                items[i] = items[i+1];
            }
        }
        count--;
    }

    public int indexOf(int index){
        if(index > count) throw new IllegalStateException();
        for(int i = 0; i<items.length;i++){
            if(i==index){
                return items[i];
            }
        }
        return -1;
    }

    public void reverseArray(){ // [1,2,3,4,5,6] -> [6,5,4,3,2,1]
        int k,temp;
        for(int i=0; i< items.length/2;i++){
            temp = items[i]; // 1
            items[i] = items[items.length-i-1];
            items[items.length-i-1] = temp;
        }
        for (int i=0;i<items.length;i++){
            System.out.println(items[i]);
        }
    }

    public void insertedAt(int index,int value){ // [ 1,2,10,3,4,5] insert at 2 -> 3
        // appraoch : create a new array list or create a new list
        int[] newItems = new int[items.length+1];

        for(int i=0; i<newItems.length;i++){
            if(i < index-1){
                newItems[i] = items[i];
            } else if (i == index-1) { //2
                newItems[i] = value;
            }else {
                newItems[i] = newItems[i-1];
            }
        }

        for(var i:newItems){
            System.out.println(i);
        }

    }

    public int max(){
        int max = items[0];
        for(int i=0;i<items.length;i++){ // [1,10,4,29]
            if(items[i] > max){
                max = items[i];
            }
        }
        return max;
    }

}
