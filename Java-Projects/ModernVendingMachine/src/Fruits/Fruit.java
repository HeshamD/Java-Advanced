package Fruits;

public class Fruit extends FruitsList {
    private String fruitName;
    private int amount;
    public Fruit(String fruitName,int amount) {
        this.fruitName = fruitName;
        this.amount= amount;
        fruitsList.add(this);
    }
    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public boolean IsExist(){
        if(amount!=0) return true;
        return false;
    }

    public int getAmount() {
        return amount;
    }
    public void adjustAmount(){
        this.amount--;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
