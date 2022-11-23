package Fruits;

import java.util.ArrayList;
import java.util.List;

public class FruitsList {
    protected List<Fruit> fruitsList; //Composite relationship with the FruitClass

    public FruitsList() {
        this.fruitsList = new ArrayList<>();
    }

    protected String findFruitName(String name){
        for(var f : fruitsList){
            if(f.getFruitName() == name){
                return name;
            }
        }
        return "This fruit doesn't exist";
    }
}
