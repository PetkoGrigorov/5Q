package managers;

import pieces.Piece;

public class GameBoard {

    public Piece[][] matrixCollection = new Piece[10][10];

    public void populate() {
//        matrixCollection[0][0] = 10;
//        matrixCollection[1][1] = 11;
//        matrixCollection[2][2] = 12;
//        matrixCollection[3][3] = 13;
    }

    public void render() {
        System.out.print("  ");
        for (int i = 0; i < matrixCollection.length; i++) {
            System.out.printf(" %d  ", i);
        }
        System.out.println();
        for (int i = 0; i < matrixCollection.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < matrixCollection.length; j++) {
                if (matrixCollection[i][j] == null) {
                    System.out.print("___ ");
                } else {
                    System.out.print(matrixCollection[i][j].type + "" + matrixCollection[i][j].color + " ");
                }
            }
            System.out.println();
        }
    }

    public void renderSingle(int i, int j) {
        System.out.println(matrixCollection[i][j]);
    }

    public void setGameBoard(Piece piece) {
        matrixCollection[piece.getRow()][piece.getCol()] = piece;
    }

    public Piece getBoardSquare(int row, int col) {
        return matrixCollection[row][col];
    }

}
