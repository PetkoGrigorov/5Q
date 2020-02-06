package pieces;

import manager.GameBoardManager;
import meta.PiecePosition;

import java.util.Arrays;

public abstract class Piece {

    protected String color;
    protected String name;
    protected int id;
    protected int power;
    protected int row;
    protected int col;

    public Piece(String color, PiecePosition position) {
        this.color = color;
        this.row = position.getRow();
        this.col = position.getCol();
    }

    public void printPieceInfo() {
        System.out.printf("Color: %s, %s, id: %d, power: %d, position: r%d/c%d\n",
                this.color, this.name, this.id, this.power, this.row, this.col);
    }

    public String getNameForTable() {
        return this.name.charAt(0) + "" + this.name.charAt(3) + this.color.charAt(0);
    }

    public String getName() {
        return this.name;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public String getColor() {
        return this.color;
    }

    public int moveRowCoefficient(PiecePosition newPosition) {
        return this.row - newPosition.getRow();
    }

    public int moveColCoefficient(PiecePosition newPosition) {
        return this.col - newPosition.getCol();
    }

    public abstract boolean isMoveValid(PiecePosition newPosition);

    public abstract boolean isAttackValid(PiecePosition newPosition);

    public boolean isPathClear(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if (isMoveValid(newPosition)) {
            int n = ((Math.abs(rowCoef) + Math.abs(colCoef) + Math.abs(Math.abs(rowCoef) - Math.abs(colCoef))) / 2);
            int[] checkRow = new int[n];
            Arrays.fill(checkRow, this.row);

            int[] checkCol = new int[n];
            Arrays.fill(checkCol, this.col);

            for (int i = 1; i <= Math.abs(rowCoef); i++) {
                checkRow[i-1] = this.row - i*(rowCoef/Math.abs(rowCoef));
            }

            for (int i = 1; i <= Math.abs(colCoef); i++) {
                checkCol[i-1] = this.col - i*(colCoef/(Math.abs(colCoef)));
            }

            for (int i = 0; i < n - 1; i++) {
                GameBoardManager board = new GameBoardManager();
                PiecePosition position = new PiecePosition(checkRow[i], checkCol[i]);
                if(board.isSquareOccupied(position)) {
                    System.out.print(board.table[checkRow[i]][checkCol[i]].color + " " + board.table[checkRow[i]][checkCol[i]].name + " is blocking move. ");
                    return false;
                }
            }
        }
        return true;
    }


}
