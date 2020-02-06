package pieces;

import manager.GameBoardManager;
import meta.PiecePosition;

public class King extends Piece {

    public King(String color, PiecePosition position) {
        super(color, position);
        this.name = "King";
        this.id = 1;
        this.power = 1;
    }

    public boolean isMoveValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if (Math.abs(rowCoef) <= 1 && Math.abs(colCoef) <= 1) {
            if (((rowCoef == 0 || colCoef == 0) || (Math.abs(rowCoef) == Math.abs(colCoef))) &&
                    !new GameBoardManager().isSquareOccupied(newPosition)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isAttackValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if (Math.abs(rowCoef) <= 1 && Math.abs(colCoef) <= 1) {
            if (((rowCoef == 0 || colCoef == 0) || (Math.abs(rowCoef) == Math.abs(colCoef))) &&
                    !new GameBoardManager().pickUpPiece(newPosition).getColor().equals(this.color)) {
                return true;
            }
        }
        return false;
    }

}
