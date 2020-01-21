package pieces;

public class Queen {

    String color;
    int power;
    int id;

    int row;
    int col;

    public Queen(String color, int row, int col) {
        this.color = color;
        this.power = 20;
        this.id = 5;
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    // ****** First variant: ***********
/*    boolean canGoUp(int moveRow, int moveCol) {
        if ((this.col == moveCol) && ((moveRow < this.row) && (moveRow >= 0))) {
            return true;
        }
        return false;
    }

    boolean canGoDown(int moveRow, int moveCol) {
        if ((this.col == moveCol) && ((moveRow > this.row) && (moveRow <= 9))) {
            return true;
        }
        return false;
    }

    boolean canGoLeft(int moveRow, int moveCol) {
        if ((this.row == moveRow) && ((moveCol < this.col) && (moveRow >= 0))) {
            return true;
        }
        return false;
    }

    boolean canGoRight(int moveRow, int moveCol) {
        if ((this.row == moveRow) && ((moveCol > this.col) && (moveRow <= 9))) {
            return true;
        }
        return false;
    }*/
    boolean canGoVertical(int moveCol) {
        return (this.col == moveCol);
    }

    boolean canGoHorizontal(int moveRow) {
        return (this.row == moveRow);
    }

    boolean canGoUpRight(int moveRow, int moveCol) {
        if ((moveCol - this.col) == (this.row - moveRow)) {
            return true;
        }
        return false;
    }

    boolean canGoUpLeft(int moveRow, int moveCol) {
        if ((this.col - moveCol) == (this.row - moveRow)) {
            return true;
        }
        return false;
    }

    boolean canGoDownLeft(int moveRow, int moveCol) {
        if ((this.col - moveCol) == (moveRow - this.row)) {
            return true;
        }
        return false;
    }

    boolean canGoDownRight(int moveRow, int moveCol) {
        if ((moveCol - this.col) == (moveRow - this.row)) {
            return true;
        }
        return false;
    }


    public boolean isMoveValid(int moveRow, int moveCol) {
        if ((moveRow <= 9 && moveRow >= 0) && (moveCol <= 9 && moveCol >= 0)) {
            if (canGoVertical(moveCol) ||
                    canGoHorizontal(moveRow) ||
                    // to ****** First variant: *********
                    /*canGoUp(moveRow, moveCol) ||
                    canGoDown(moveRow, moveCol) ||
                    canGoLeft(moveRow, moveCol) ||
                    canGoRight(moveRow, moveCol) ||*/
                    canGoDownLeft(moveRow, moveCol) ||
                    canGoDownRight(moveRow, moveCol) ||
                    canGoUpRight(moveRow, moveCol) ||
                    canGoUpLeft(moveRow, moveCol)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void move(int moveRow, int moveCol) {
        if (isMoveValid(moveRow, moveCol)) {
            this.row = moveRow;
            this.col = moveCol;
        } else {
            System.out.println("Problem!!!");
        }
    }


}
