package Interfaces;

public interface States {
    String swipeCardState(String cardNumber);
    String selectItemState(String item);
    boolean confirmState();
    boolean cancelState();
    boolean dispenseState();
}
