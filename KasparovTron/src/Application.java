import config.PieceColor;
import managers.GameBoard;
import pieces.*;
import tests.PawnTest;
import tests.RookTest;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Welcome to KASPAROV-TRON 101");

        GameBoard board = new GameBoard();
        board.setGameBoard(new Pawn(PieceColor.BLACK, 8, 0, 1));
        board.setGameBoard(new Pawn(PieceColor.BLACK, 8, 1, 2));
        board.setGameBoard(new Pawn(PieceColor.BLACK, 8, 2, 3));
        board.setGameBoard(new Pawn(PieceColor.BLACK, 8, 3, 4));
        board.setGameBoard(new Pawn(PieceColor.BLACK, 8, 4, 5));

        board.setGameBoard(new Rook(PieceColor.BLACK, 5, 4));

        board.setGameBoard(new Knight(PieceColor.BLACK, 9, 1));
        board.setGameBoard(new Bishop(PieceColor.BLACK, 6, 2));
        board.setGameBoard(new King(PieceColor.BLACK, 5, 1));
        board.setGameBoard(new Queen(PieceColor.BLACK, 9, 4));

        board.setGameBoard(new Pawn(PieceColor.WHITE, 1, 5, 1));
        board.setGameBoard(new Pawn(PieceColor.WHITE, 1, 6, 2));
        board.setGameBoard(new Pawn(PieceColor.WHITE, 1, 7, 3));
        board.setGameBoard(new Pawn(PieceColor.WHITE, 1, 8, 4));
        board.setGameBoard(new Pawn(PieceColor.WHITE, 1, 9, 5));

        board.setGameBoard(new Rook(PieceColor.WHITE, 6, 6));

        board.setGameBoard(new Knight(PieceColor.WHITE, 0, 8));
        board.setGameBoard(new Bishop(PieceColor.WHITE, 3, 2));
        board.setGameBoard(new King(PieceColor.WHITE, 4, 8));
        board.setGameBoard(new Queen(PieceColor.WHITE, 0, 5));

        System.out.println();
        board.render();
        System.out.println();

        boolean isWhiteTurn = true;
        String playerClor = PieceColor.WHITE;

        while (true) {
            if (isWhiteTurn) {
                playerClor = PieceColor.WHITE;
            } else {
                playerClor = PieceColor.BLACK;
            }
            System.out.println(playerClor + " is on turn");
            System.out.print("Enter start coordinates (on this line in format: row col): ");
            int row = cin.nextInt();
            if (row > 10) {
                break;
            }
            int col = cin.nextInt();

            if (board.matrixCollection[row][col] != null) {

                if (board.matrixCollection[row][col].color.equals(playerClor)) {
                    System.out.printf("You picked %s%s\n", board.matrixCollection[row][col].type, board.matrixCollection[row][col].color);

                    System.out.print("Enter move coordinates (on this line in format: row col): ");
                    int mRow = cin.nextInt();
                    int mCol = cin.nextInt();


                    //Piece fig = board.matrixCollection[row][col];
                    if (board.matrixCollection[row][col].isMoveValid(board, mRow, mCol)) {
                        board.matrixCollection[row][col].move(board, mRow, mCol);
                        isWhiteTurn = !isWhiteTurn;

                        board.matrixCollection[mRow][mCol].getInfo();
                        System.out.println();
                        board.render();
                        System.out.println();
                    } else {
                        if (board.matrixCollection[row][col].isAttackValid(board, mRow, mCol)) {
                            board.matrixCollection[row][col].attack(board, mRow, mCol);
                            isWhiteTurn = !isWhiteTurn;

                            board.matrixCollection[mRow][mCol].getInfo();
                            System.out.println();
                            board.render();
                            System.out.println();
                        } else {
                            System.out.println("Enter valid move. ");
                        }
                    }

                } else {
      //              System.out.println(playerClor + " is on turn");
                }
            } else {
                System.out.println("Empty square. ");
            }


        }
        System.out.println();
        board.render();




//        board.getBoardSquare(8, 0).getInfo();
//        board.getBoardSquare(9, 4).getInfo();
//        board.getBoardSquare(8, 3).getInfo();
//        board.getBoardSquare(9, 2).getInfo();
//        if (board.matrixCollection[5][4] == null) {
//            System.out.println("yes, it's un occupied");
//        }
//        System.out.println(board.matrixCollection[5][4]);


    }
}
