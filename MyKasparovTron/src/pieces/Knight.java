package pieces;

import manager.GameBoardManager;
import meta.PiecePosition;

public class Knight extends Piece {

    public Knight(String color, PiecePosition position) {
        super(color, position);
        this.name = "Knight";
        this.id = 1;
        this.power = 5;
    }

    public String getNameForTable() {
        return this.name.charAt(0) + "" + this.name.charAt(5) + this.color.charAt(0);
    }

    @Override
    public boolean isMoveValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if (((Math.abs(rowCoef) == 1 && Math.abs(colCoef) == 2) || ((Math.abs(rowCoef) == 2 && Math.abs(colCoef) == 1))) &&
                !new GameBoardManager().isSquareOccupied(newPosition)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isAttackValid(PiecePosition newPosition) {
        int rowCoef = this.moveRowCoefficient(newPosition);
        int colCoef = this.moveColCoefficient(newPosition);
        if (((Math.abs(rowCoef) == 1 && Math.abs(colCoef) == 2) || ((Math.abs(rowCoef) == 2 && Math.abs(colCoef) == 1))) &&
                !new GameBoardManager().pickUpPiece(newPosition).getColor().equals(this.color)) {
            return true;
        }
        return false;
    }

    public boolean isPathClear(PiecePosition newPosition) {
        return true;
    }
}
