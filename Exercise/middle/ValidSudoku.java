package middle;

import java.util.HashSet;

/**
 * description
 *
 * @author shelin 2021/02/08 17:00
 */
public class ValidSudoku {

    public static void main(String[] args) {
        String[][] board = {
                {"8","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},
                {".","9","8",".",".",".",".","6","."},
                {"2",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"}
        };
        boolean validSudoku = isValidSudoku(board);
        System.out.println(validSudoku);
    }


    public static boolean isValidSudoku(String[][] board) {
        boolean flag = true;
        for (int i = 0; i < board.length; i++) {

            HashSet<String> row = new HashSet<>();
            HashSet<String> column = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (!".".equals(board[i][j])) {
                    if (row.contains(board[i][j])) {
                        flag = false;
                    } else {
                        row.add(board[i][j]);
                    }
                }
                if (!".".equals(board[j][i])) {
                    if (column.contains(board[j][i])) {
                        flag = false;
                    }else {
                        column.add(board[j][i]);
                    }
                }
            }
        }
        return flag;
    }

}
