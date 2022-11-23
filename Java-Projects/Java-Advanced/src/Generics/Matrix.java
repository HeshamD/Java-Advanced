package Generics;

public class Matrix {
    private int[][] items ;
    private int rowSize;
    private int columnSize;
    public Matrix(int r,int c){
        this.rowSize = r;
        this.columnSize = c;
        this.items = new int[rowSize][columnSize ];
    }
    public void setValue(int row, int column , int value){
        this.items[row][column] =  value;
    }
    public int getValue(int row,int column){
        return items[row][column];
    }

}
