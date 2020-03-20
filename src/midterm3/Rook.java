package midterm3;

public class Rook extends Piece {

    public Rook(int row, int column) {
        super(row, column);
    }

    @Override
    public boolean moveValid(int row, int column) {
        return (row == this.getRow() && column != this.getColumn())
                || (row != this.getRow() && column == this.getColumn());
    }

}
