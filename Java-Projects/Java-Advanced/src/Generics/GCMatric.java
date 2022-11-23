package Generics;

public class GCMatric<T extends Number> {
    //private T[][] items;
    private Object[][] items;
    private int rowSize;
    private int columnSize;

    public GCMatric(int r, int c){
        this.rowSize = r;
        this.columnSize = c;
        this.items =(T[][]) new Object[rowSize][columnSize ];
    }

    public void setValue(int row, int column , T value){
        this.items[row][column] =  value;
    }
    public Object getValue(int row,int column){
        return items[row][column];
    }
}
