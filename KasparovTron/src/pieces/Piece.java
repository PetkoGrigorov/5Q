package pieces;

import managers.GameBoard;

public abstract class Piece {

    public String color;
    public int power;
    public int id;

    public int row;
    public int col;

    public String type;


    public Piece(String color, int row, int col) {
        this.color = color;
        this.row = row;
        this.col = col;
    }

    public abstract void move(GameBoard board, int row, int col);

    public abstract void attack(GameBoard board, int row, int col);

    public boolean isMoveValid(GameBoard board, int row, int col) {
        return true;
    }

    public boolean isAttackValid(GameBoard board, int row, int col) {
        return true;
    }

    public boolean isEmptySquare(GameBoard board, int row, int col){
        return (board.matrixCollection[row][col] == null);
    }


    //******************
    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    //*********************
    public void getInfo() {
//        System.out.println("Color -> " + this.color);
//        System.out.println("Power -> " + this.power);
//        System.out.println("ID -> " + this.id);
//        System.out.println("Row -> " + this.row);
//        System.out.println("Col -> " + this.col);
        System.out.printf("%s - Color: %s, Power: %d, ID: %d, Row: %d, Col: %d\n", this.type, this.color, this.power, this.id, this.row, this.col);

    }
}
