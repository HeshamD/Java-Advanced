package Stacks;

import java.util.ArrayList;

public class Stack1 {
    // stack is first in last out
    // the way of storage is different
    // all the operations are O(1)

    int size=0;
    private ArrayList<Integer> stackItems = new ArrayList<>();

    public void push(int element){
        stackItems.add(element);
        size++;
    }
    public int pop(){
        int e =  stackItems.remove(size-1);
        size--;
        return e;
    }

    public int peek(){
        return stackItems.get(size-1);
    }

    public boolean isEmpty(){
        return stackItems.isEmpty();
    }


}

