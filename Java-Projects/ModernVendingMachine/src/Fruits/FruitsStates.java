package Fruits;
import Interfaces.States;
public class FruitsStates implements States {
//    private final Fruit fruit; // dependecy injection, the fruit class is used
//
//    public FruitsStates(Fruit fruit) {
//        this.fruit = fruit;
//    }

    @Override
    public String swipeCardState(String cardNumber) {
        if (cardNumber.length() > 15 || cardNumber.length() <= 0) return "Accepted";
        return "Rejected";
    }

    @Override
    public String selectItemState(String item) {
//        if (!this.fruit.IsExist()) return "This fruit is sold out";
//        this.fruit.adjustAmount();
//        return this.fruit.findFruitName(item);

        if(item.length() !=0) return "Selected item "+ item;
        return "Nothing been selected";

    }

    @Override
    public boolean confirmState() {
//        if(this.fruit.IsExist()) return true;
//        return false;
        return true;
    }

    @Override
    public boolean cancelState() {
        return true;
    }

    @Override
    public boolean dispenseState() {
        return true;
    }
}
