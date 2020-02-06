package pieces;

import congig.PieceColor;
import manager.GameBoardManager;
import meta.PiecePosition;

public class Pawn extends Piece {

    public Pawn(String color, int id, PiecePosition position) {
        super(color, position);
        this.name = "Pawn";
        this.id = id;
        this.power = 1;
    }

    @Override
    public boolean isMoveValid( PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        int sign;
        if (this.getColor() == PieceColor.COLOR_2) {
            sign = 1;
        } else {
            sign = -1;
        }
        if (colCoef == 0 && rowCoef * sign == 1 && !new GameBoardManager().isSquareOccupied(newPosition)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isAttackValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        int sign;
        if (this.getColor() == PieceColor.COLOR_2) {
            sign = 1;
        } else {
            sign = -1;
        }
        if (new GameBoardManager().isSquareOccupied(newPosition)){
            if (Math.abs(colCoef) == 1 && rowCoef * sign == 1 &&
                    !new GameBoardManager().pickUpPiece(newPosition).getColor().equals(this.color)) {
                return true;
            }
        }
        return false;
    }


}
