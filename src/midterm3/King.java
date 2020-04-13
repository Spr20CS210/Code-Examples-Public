package midterm3;

public class King extends Piece {

    public King(int row, int column) {
        super(row, column);
    }

    @Override
    public boolean moveValid(int row, int column) {
        if (row < 0 || row > 7 || column < 0 || column > 7) {
            return false;
        }
        int currRow = this.getRow();
        int currCol = this.getColumn();
        if (currRow == row && currCol == column) {
            return false;
        }
        return Math.abs(currRow - row) <= 1 && Math.abs(currCol - column) <= 1;
    }
}
