package RandomProblems;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ClassProblem {

    private Set<Integer> items = new HashSet<>();

    public void insert(int value){
        this.items.add(value);
    }

    public void remove(int value){
        if (this.items.contains(value)) this.items.remove(value);
        else {
            System.out.println("there is no such an element " + value);
        }
    }

    public Object getRandom(){
       Object[] elements = items.toArray();
       return elements[0];// returns random
    }

}
/*
Design a class:
- inserting a value (no duplicates)
- Removing a value
- GetRandom value that's already inserted( with equal probability )

Question:

Q1: values are integers
Q2: in terms of million
Q3: which one function will be using at most

* */
