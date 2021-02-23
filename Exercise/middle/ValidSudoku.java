package middle;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author shelin 2021/02/08 17:00
 */
public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'2','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'8','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean validSudoku = isValidSudoku(board);
        System.out.println(validSudoku);
    }


    public static boolean isValidSudoku(char[][] board) {
        boolean[][] block = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            List<Character> row = new ArrayList<>();
            List<Character> column = new ArrayList<>();
            for (int j = 0; j < board[i].length; j++) {
                if ('.' != board[i][j]) {
                    if (row.contains(board[i][j])) {
                        return false;
                    } else {
                        row.add(board[i][j]);
                    }
                    int num = board[i][j] - '1';
                    int blockIndex = i / 3 * 3 + j / 3;
                    if (block[blockIndex][num]) {
                        return false;
                    } else {
                        block[blockIndex][num] = true;
                    }
                }
                if ('.' != board[j][i]) {
                    if (column.contains(board[j][i])) {
                        return false;
                    } else {
                        column.add(board[j][i]);
                    }
                }
            }
        }
        return true;
    }

}
