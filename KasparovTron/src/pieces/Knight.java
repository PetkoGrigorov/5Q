package pieces;

import managers.GameBoard;

public class Knight extends Piece {

    public Knight(String color, int row, int col) {
        super(color, row, col);
        this.power = 5;
        this.id = 3;
        this.type = "Kt";
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
            if (isPathClear(board, row, col)) {
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
        if (!board.matrixCollection[this.row][this.col].isEmptySquare(board, row, col)) {
            if (board.matrixCollection[this.row][this.col].color.equals(board.matrixCollection[row][col].color)) {
                System.out.println("Can't attack own piece");
            } else {
                if (isPathClear(board, row, col)) {
                    result = true;
                }
            }
        }
        return result;
    }

    boolean isPathClear(GameBoard board, int row, int col) {
        return  ((Math.abs(this.row - row) + Math.abs(this.col - col)) == 3);
    }
}
