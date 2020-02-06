import congig.PieceColor;
import manager.GameBoardManager;
import meta.PiecePosition;
import pieces.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        GameBoardManager board = new GameBoardManager();
        board.initTable();
        board.render();
        boolean turnChange = true;
        String colorOnTurn = PieceColor.COLOR_1;

        while (true) {
            System.out.printf("Pick up %s Piece: ", colorOnTurn);

            int row = cin.nextInt();
            if (row > 9 || row < 0) {
                break;
            }
            int col = cin.nextInt();
            PiecePosition piecePosition = new PiecePosition(row, col);

            if (!board.isSquareOccupied(piecePosition)) {
                System.out.println("Empty Square");
            } else {
                if (!board.isYourTurn(colorOnTurn, piecePosition)) {
                    System.out.println(colorOnTurn + " is on turn");
                } else {
                    Piece selectedPiece = board.pickUpPiece(piecePosition);
                    System.out.println("You picked " + selectedPiece.getNameForTable());
                    System.out.print("Select new position: ");
                    int newRow = cin.nextInt();
                    int newCol = cin.nextInt();
                    PiecePosition newPosition = new PiecePosition(newRow, newCol);
                    if ((selectedPiece.isMoveValid(newPosition) || selectedPiece.isAttackValid(newPosition)) &&
                            selectedPiece.isPathClear(newPosition)) {
                        board.move_Attack(newPosition, selectedPiece);
                        turnChange = !turnChange;
                        board.render();
                        if (turnChange) {
                            colorOnTurn = PieceColor.COLOR_1;
                        } else {
                            colorOnTurn = PieceColor.COLOR_2;
                        }
                    } else {
                        System.out.println("Not valid move");
                    }
                }
            }
        }
           board.render();
    }
}
