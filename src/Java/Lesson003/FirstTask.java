package Java.Lesson003;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    static int[][] board;
    static List<List<String>> ans = new ArrayList<>();
    static int[][] knightMoves = new int[][]{
            {1, 2}, {-1, 2}, {1, -2}, {-1, -2},
            {2, 1}, {-2, 1}, {2, 1}, {-2, -1}
    };

    public static List<List<String>> solveKnight(int n) {
        board = new int[n][n];
        backTrack(0, 0, 1);
        return ans;
    }

    private static void backTrack(int row, int col, int moveNumber) {
        if (moveNumber == board.length * board.length) {
            addBoard();
            return;
        }
        for (int[] move : knightMoves) {
            if (canPlease(row, col)) {
                board[row][col] = moveNumber;
                int newRow = row + move[0];
                int newCol = col + move[1];
                backTrack(newRow, newCol, moveNumber + 1);
                if (moveNumber != 0) board[row][col] = 0;
            }
        }
    }

    private static boolean canPlease(int i, int j) {
        return (i >= 0 && i < board.length && j >= 0 && j < board.length && board[i][j] == 0);
    }

    private static void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[i][j] + " ");
            }
            b.add(sb.toString());
        }
        ans.add(b);
    }

    public static void main(String[] args) {
        solveKnight(5);
        System.out.println(ans.size());
    }
}
