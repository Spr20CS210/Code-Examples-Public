package midterm4;

public class Queens {

    private static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        Board board = new Board(BOARD_SIZE);

        System.out.println(queens(board, 8, 0));

        System.out.println(board);
    }

    private static boolean queens(Board board, int numQueens, int col) {
        if (numQueens == 0) {
            return true;
        } else {
            for (int row = 0; row < BOARD_SIZE; row++) {
                if (board.isSafe(row, col)) {
                    board.place(row, col);
                    if (queens(board, numQueens - 1, col + 1)) {
                        return true;
                    }
                    board.remove(row, col);
                }
            }
            return false;
        }
    }

}
