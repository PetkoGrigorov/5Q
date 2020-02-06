package manager;

import congig.PieceColor;
import meta.PiecePosition;
import pieces.*;

public class GameBoardManager {

    public static Piece[][] table = new Piece[10][10];

    public void initTable() {
        Piece pawnA1 = new Pawn(PieceColor.COLOR_1, 1, new PiecePosition(1, 5));
        Piece pawnA2 = new Pawn(PieceColor.COLOR_1, 2, new PiecePosition(1, 6));
        Piece pawnA3 = new Pawn(PieceColor.COLOR_1, 3, new PiecePosition(1, 7));
        Piece pawnA4 = new Pawn(PieceColor.COLOR_1, 4, new PiecePosition(1, 8));
        Piece pawnA5 = new Pawn(PieceColor.COLOR_1, 5, new PiecePosition(1, 9));
        Queen queenA = new Queen(PieceColor.COLOR_1, new PiecePosition(0, 5));
        King kingA = new King(PieceColor.COLOR_1, new PiecePosition(0, 6));
        Bishop bishopA = new Bishop(PieceColor.COLOR_1, new PiecePosition(0, 7));
        Knight knightA = new Knight(PieceColor.COLOR_1, new PiecePosition(0, 8));
        Rook rookA = new Rook(PieceColor.COLOR_1, new PiecePosition(0, 9));

        Piece pawnB1 = new Pawn(PieceColor.COLOR_2, 1, new PiecePosition(8, 0));
        Piece pawnB2 = new Pawn(PieceColor.COLOR_2, 2, new PiecePosition(8, 1));
        Piece pawnB3 = new Pawn(PieceColor.COLOR_2, 3, new PiecePosition(8, 2));
        Piece pawnB4 = new Pawn(PieceColor.COLOR_2, 4, new PiecePosition(8, 3));
        Piece pawnB5 = new Pawn(PieceColor.COLOR_2, 5, new PiecePosition(8, 4));

        Queen queenB = new Queen(PieceColor.COLOR_2, new PiecePosition(9, 4));
        King kingB = new King(PieceColor.COLOR_2, new PiecePosition(9, 3));
        Bishop bishopB = new Bishop(PieceColor.COLOR_2, new PiecePosition(9, 2));
        Knight knightB = new Knight(PieceColor.COLOR_2, new PiecePosition(9, 1));
        Rook rookB = new Rook(PieceColor.COLOR_2, new PiecePosition(9, 0));

        table[pawnA1.getRow()][pawnA1.getCol()] = pawnA1;
        table[pawnA2.getRow()][pawnA2.getCol()] = pawnA2;
        table[pawnA3.getRow()][pawnA3.getCol()] = pawnA3;
        table[pawnA4.getRow()][pawnA4.getCol()] = pawnA4;
        table[pawnA5.getRow()][pawnA5.getCol()] = pawnA5;
        table[queenA.getRow()][queenA.getCol()] = queenA;
        table[kingA.getRow()][kingA.getCol()] = kingA;
        table[bishopA.getRow()][bishopA.getCol()] = bishopA;
        table[knightA.getRow()][knightA.getCol()] = knightA;
        table[rookA.getRow()][rookA.getCol()] = rookA;

        table[pawnB1.getRow()][pawnB1.getCol()] = pawnB1;
        table[pawnB2.getRow()][pawnB2.getCol()] = pawnB2;
        table[pawnB3.getRow()][pawnB3.getCol()] = pawnB3;
        table[pawnB4.getRow()][pawnB4.getCol()] = pawnB4;
        table[pawnB5.getRow()][pawnB5.getCol()] = pawnB5;
        table[queenB.getRow()][queenB.getCol()] = queenB;
        table[kingB.getRow()][kingB.getCol()] = kingB;
        table[bishopB.getRow()][bishopB.getCol()] = bishopB;
        table[knightB.getRow()][knightB.getCol()] = knightB;
        table[rookB.getRow()][rookB.getCol()] = rookB;
    }

    public void render() {
        System.out.print("  ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == null) {
                    System.out.print(" .  ");
                } else {
                    System.out.printf("%s ", table[i][j].getNameForTable());
                }
            }
            System.out.println(" " + i);
        }
        System.out.print("  ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.println();
    }

    public boolean isSquareOccupied(PiecePosition position) {
        if (table[position.getRow()][position.getCol()] != null) {
            return true;
        }
        return false;
    }

    public Piece pickUpPiece(PiecePosition position) {
        return this.table[position.getRow()][position.getCol()];
    }

    public boolean isYourTurn(String color, PiecePosition position) {
        if (this.table[position.getRow()][position.getCol()].getColor().equals(color)) {
            return true;
        }
        return false;
    }

    public void move_Attack(PiecePosition newPosition, Piece piece) {
            int row = piece.getRow();
            int col = piece.getCol();
            if (!isSquareOccupied(newPosition)) {
                System.out.println(piece.getNameForTable() + " move");
                piece.setRow(newPosition.getRow());
                piece.setCol(newPosition.getCol());
                this.table[newPosition.getRow()][newPosition.getCol()] = piece;
                this.table[row][col] = null;
            } else {
                if (!piece.getColor().equals(pickUpPiece(newPosition).getColor())){
                    System.out.println(piece.getNameForTable() + " attack");
                    piece.setRow(newPosition.getRow());
                    piece.setCol(newPosition.getCol());
                    this.table[newPosition.getRow()][newPosition.getCol()] = piece;
                    this.table[row][col] = null;
                }
            }
    }

}
