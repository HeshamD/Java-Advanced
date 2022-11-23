import Interfaces.States;

public class VendingMachine {

    // The main problem with this code is that it violates the Open-Closed Principle
    // this class will be modified in the future if we need to add more fruits
    // also alot if selection statements will be added
    // it's not a good approach
    //    private Fruits;
    //    public void sell(){
    //        if(fruits == Fruits.BANANA){
    //            System.out.println("Banana been selected");
    //        } else if (fruits == Fruits.APPLE) {
    //            System.out.println("Apple been selected");
    //        }else if (fruits == Fruits.CARROT){
    //            System.out.println("Carrot been selected");
    //        }else if (fruits == Fruits.PEACH){
    //            System.out.println("Peach been selected");
    //        }else {
    //            System.out.println("Nothing been selected");
    //        }
    //    }

    private States statesSellingItems;

    public void sell(String cardNumber,String selectedItem){
        System.out.println(statesSellingItems.swipeCardState(cardNumber));
        System.out.println(statesSellingItems.dispenseState());
        System.out.println(statesSellingItems.confirmState());
        System.out.println(statesSellingItems.selectItemState(selectedItem) );
    }
    public States getCurrentState(){return statesSellingItems;}
    public void setStatesSellingItems(States stateObject){this.statesSellingItems = stateObject;}

}
