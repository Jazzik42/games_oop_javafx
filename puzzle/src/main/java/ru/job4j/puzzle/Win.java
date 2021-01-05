package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != 0) {
                if (gorizontal(board, i) || vertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean gorizontal(int[][] board, int row) {
        boolean rslG = true;
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 0) {
                rslG = false;
                break;
            }
        }
        return rslG;
    }


    public static boolean vertical(int[][] board, int column) {
        boolean rslV = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 0) {
                    rslV = false;
                    break;
                }
            }
            return rslV;
        }
    }


