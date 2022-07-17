package com.TeachmeLessons.Lesson5;

public class ChessBoard {
    /* 2. Шахматная доска
     * Создать программу для раскраски шахматной доски с помощью цикла.
     * Создать двумерный массив String-ов 8х8. С помощью циклов задать
     * элементам циклам значения B(Black) или W(White). Результат работы
     * программы:
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W */

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        ChessBoard.whiteBlack(chessBoard);
    }

    public static void whiteBlack(String[][] chessBoard) {

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i % 2 == 0 && j % 2 == 0)||(i % 2 != 0 && j % 2 != 0)){
                    chessBoard[i][j] = "W";
                } else {
                            //if ((i % 2 == 0 && j % 2 != 0)||(i % 2 != 0) && (j % 2 == 0)) {
                        chessBoard[i][j] = "B";
                }
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.print(System.lineSeparator());
        }
    }
}
