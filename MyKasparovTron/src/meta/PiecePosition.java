package meta;

public class PiecePosition {
    private int row;
    private int col;

    public PiecePosition(int row, int col) {
        setRow(row);
        setCol(col);
    }

    private void setRow(int row) {
        if (row >= 0 && row <= 9) {
            this.row = row;
        }
    }

    private void setCol(int col) {
        if (col >= 0 && col <= 9) {
            this.col = col;
        }
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }


}

