package pieces;

import config.PieceColor;
import managers.GameBoard;

public class Pawn extends Piece implements IHealable {

    public Pawn(String color, int row, int col, int id) {
        super(color, row, col);
        this.power = 1;
        this.id = id;
        this.type = "Pn";
    }

    @Override
    public void move(GameBoard board, int row, int col) {
//        if (isMoveValid(board, row, col)) {
        board.matrixCollection[row][col] = board.matrixCollection[this.row][this.col];
        board.matrixCollection[this.row][this.col] = null;
        this.row = row;
        this.col = col;
        System.out.println("Moved to " + this.row + " : " + this.col);
        //       } else {
//            System.out.println("Not allowed");
        //       }
    }

    public boolean isMoveValid(GameBoard board, int row, int col) {
        boolean result = false;
        if (board.matrixCollection[this.row][this.col].isEmptySquare(board, row, col)) {
            if ((board.matrixCollection[this.row][this.col].color.equals(PieceColor.BLACK)) && (this.col == col) && (this.row - row == 1)) {
                result = true;
            }
            if ((board.matrixCollection[this.row][this.col].color.equals(PieceColor.WHITE)) && (this.col == col) && (this.row - row == -1)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public void attack(GameBoard board, int row, int col) {
        //       if (isAttackValid(board, row, col)) {
        board.matrixCollection[row][col] = board.matrixCollection[this.row][this.col];
        board.matrixCollection[this.row][this.col] = null;
        this.row = row;
        this.col = col;
        System.out.println("Attack is successful.\nMoved to " + this.row + " : " + this.col);
//            System.out.println("Moved to " + this.row + " : " + this.col);
//        } else {
//            System.out.println("Not allowed");
//        }
    }

    public boolean isAttackValid(GameBoard board, int row, int col) {

        boolean result = false;
        if (!board.matrixCollection[this.row][this.col].isEmptySquare(board, row, col) &&
                !board.matrixCollection[this.row][this.col].color.equals(board.matrixCollection[row][col].color)) {
            if ((board.matrixCollection[this.row][this.col].color.equals(PieceColor.BLACK)) && (Math.abs(this.col - col) == 1) && (this.row - row == 1)) {
                result = true;
            }
            if ((board.matrixCollection[this.row][this.col].color.equals(PieceColor.WHITE)) && (Math.abs(this.col - col) == 1) && (this.row - row == -1)) {
                result = true;
            }
        }
        return result;
    }






    public void heal() {

    }
}
