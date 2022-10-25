package Java.Lesson003;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    static int[][] board;
    static List<List<String>> ans = new ArrayList<>();
    static int moveNumber = 1;
    static int[][] knightMoves = new int[][]{
            {1, 2}, {-1, 2}, {1, -2}, {-1, -2},
            {2, 1}, {-2, 1}, {2, 1}, {-2, -1}
    };

    public static List<List<String>> solveKnight(int n) {
        board = new int[n][n];
        backTrack(1, 1);
        return ans;
    }

    private  static void backTrack (int row, int col) {
        if (moveNumber == board.length * board.length) {
            addBoard();
            moveNumber = 1;
            return;
        }
        for (int[] move: knightMoves
             ) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (canPlease(newRow, newCol)) {
                board[newRow][newCol] = moveNumber;
                moveNumber++;
                backTrack(newRow, newCol);
                board[newRow][newCol] = 0;
                moveNumber--;
            }
        }
    }

    private static boolean canPlease(int i, int j) {
        if (i >= 0 &&
        i < board.length &&
        j >= 0 &&
        j < board.length &&
        board[i][j] == 0) return true;
        return false;
    }

    private  static void addBoard() {
        List<String> b =new ArrayList<>();
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
        for (List<String> item: ans
             ) {
            System.out.print(item);
        }
    }
}
