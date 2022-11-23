import Fruits.Fruit;
import Fruits.FruitsStates;
import Interfaces.States;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple",5);
        Fruit banana = new Fruit("Banana",5);
        Fruit peach = new Fruit("Peach",5);
        Fruit carrot = new Fruit("Carrot",5);

        var vendingMahine = new VendingMachine();

        vendingMahine.setStatesSellingItems(new FruitsStates());
        vendingMahine.sell("123456789010123","fruits");

    }

}