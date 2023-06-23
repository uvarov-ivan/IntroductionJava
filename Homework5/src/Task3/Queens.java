package Task3;

import java.util.Arrays;

import Task1.OtherMethods;

public class Queens {
    private static int[][] chessBoard = new int[8][8];

    public static String[] arrangementQueens() {
        String[] placesQueens = new String[8]; // Хранит расположение ферзей на доске
        int countQueens = 0; // Знает сколько ферзей уже на доске
        int[] nextStart = { 0, 0 }; // С какой клетки начнётся следующая попытка

        while (countQueens < 8) { // пока не расставит 8 ферзей домой не пойдёт
            Arrays.fill(placesQueens, ""); // Обнуляет значение размещения ферзей
            for (int i = 0; i < chessBoard[0].length; i++) { // очищаем доску
                Arrays.fill(chessBoard[i], 0);
            }


            int i = nextStart[0]; // Здесь i и j так как они были в forе, но пришлось вынести сюда, в форе теперь b и c
            int j = nextStart[1];
            placesQueens[countQueens] = OtherMethods.indexToPlaceQueen(i, j); //Вносит в память место первого ферзя
            countQueens += 1;
            chessBoard[i][j] = countQueens; //отмечает ферзя на доске

            for (int l = 0; l < chessBoard[1].length; l++) { //заполняет доску по горизонтали
                chessBoard[l][j] = countQueens;
            }

            for (int m = 0; m < chessBoard[0].length; m++) { //заполняет доску по вертикали
                chessBoard[i][m] = countQueens;
            }

            int l1 = i + 1;
            int m1 = j + 1;
            while (m1 < chessBoard[0].length && l1 < chessBoard[1].length) { //заполняет доску по диагонали вниз вправо
                chessBoard[l1][m1] = countQueens;
                l1 += 1;
                m1 += 1;

            }

            int l2 = i - 1;
            int m2 = j - 1;
            while (m2 >= 0 && l2 >= 0) { //заполняет доску по диагонали вверх влево
                chessBoard[l2][m2] = countQueens;
                l2 -= 1;
                m2 -= 1;
            }

            int l3 = i + 1;
            int m3 = j - 1;
            while (m3 >= 0 && l3 < chessBoard[1].length) { //заполняет доску по диагонали вниз влево
                chessBoard[l3][m3] = countQueens;
                l3 += 1;
                m3 -= 1;
            }

            int l4 = i - 1;
            int m4 = j + 1;
            while (m4 < chessBoard[0].length && l4 >= 0) { //заполняет доску по диагонали вверх вправо
                chessBoard[l4][m4] = countQueens;
                l4 -= 1;
                m4 += 1;
            }


            for (int x = 0; x < chessBoard[0].length; x++) { //теперь по аналогии расставляем остальных ферзей
                for (int y = 0; y < chessBoard[1].length; y++) {

                    if (chessBoard[x][y] == 0) {
                        placesQueens[countQueens] = OtherMethods.indexToPlaceQueen(x, y);

                        countQueens += 1;
                        chessBoard[x][y] = countQueens * 5;

                        for (int b = 0; b < chessBoard[1].length; b++) {
                            chessBoard[b][y] = countQueens;
                        }

                        for (int c = 0; c < chessBoard[0].length; c++) {
                            chessBoard[x][c] = countQueens;
                        }

                        int b1 = x + 1;
                        int c1 = y + 1;
                        while (c1 < chessBoard[0].length && b1 < chessBoard[1].length) {
                            chessBoard[b1][c1] = countQueens;
                            b1 += 1;
                            c1 += 1;

                        }

                        int b2 = x - 1;
                        int c2 = y - 1;
                        while (c2 >= 0 && b2 >= 0) {
                            chessBoard[b2][c2] = countQueens;
                            b2 -= 1;
                            c2 -= 1;
                        }

                        int b3 = x + 1;
                        int c3 = y - 1;
                        while (c3 >= 0 && b3 < chessBoard[1].length) {
                            chessBoard[b3][c3] = countQueens;
                            b3 += 1;
                            c3 -= 1;
                        }

                        int b4 = x - 1;
                        int c4 = y + 1;
                        while (c4 < chessBoard[0].length && b4 >= 0) {
                            chessBoard[b4][c4] = countQueens;
                            b4 -= 1;
                            c4 += 1;
                        }

                    }

                }
            }

            
            if (countQueens < 8) {
                if (nextStart[1] == 7) { // Когда прошли всю строку, переходим на другую
                    nextStart[0] += 1;
                    nextStart[1] = 0;
                    countQueens = 0;
                } else {

                    nextStart[1] += 1; // Старт переносим вправо на одну клетку
                    countQueens = 0;
                }

            }

        }

        return placesQueens; //Расставил все 8 ферзей, может идти домой
    }
}
