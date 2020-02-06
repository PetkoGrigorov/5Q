package pieces;

import manager.GameBoardManager;
import meta.PiecePosition;

public class Rook extends Piece {

    public Rook(String color, PiecePosition position) {
        super(color, position);
        this.name = "Rook";
        this.id = 1;
        this.power = 5;
    }


    @Override
    public boolean isMoveValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if ((rowCoef == 0 || colCoef == 0) && !new GameBoardManager().isSquareOccupied(newPosition)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isAttackValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if ((rowCoef == 0 || colCoef == 0) && !new GameBoardManager().pickUpPiece(newPosition).getColor().equals(this.color)) {
            return true;
        }
        return false;
    }

}
