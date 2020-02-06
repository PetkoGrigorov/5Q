package pieces;

import manager.GameBoardManager;
import meta.PiecePosition;

import java.util.Arrays;

public class Queen extends Piece {

    public Queen(String color, PiecePosition position) {
        super(color, position);
        this.name = "Queen";
        this.id = 1;
        this.power = 20;
    }

    public String getNameForTable() {
        return this.name.charAt(0) + "" + this.name.charAt(4) + this.color.charAt(0);
    }

    @Override
    public boolean isMoveValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if (((rowCoef == 0 || colCoef == 0) || (Math.abs(rowCoef) == Math.abs(colCoef))) &&
                !new GameBoardManager().isSquareOccupied(newPosition)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isAttackValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if (((rowCoef == 0 || colCoef == 0) || (Math.abs(rowCoef) == Math.abs(colCoef))) &&
                !new GameBoardManager().pickUpPiece(newPosition).getColor().equals(this.color)) {
            return true;
        }
        return false;
    }

}
