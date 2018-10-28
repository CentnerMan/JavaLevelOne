package ru.lebedev.se;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Анатолий Лебедев
 * @version 1.0.0
 */

public class TikTak {
    public static int size = 5; // 5
    public static int block = 4; //4
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random randomStep = new Random();
    public static int aiLevel = 0; //уровень ИИ

    public static void main(String[] args) {
        go();
    }

    public static void go() {
        customizeGame();
        initMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            //--------------------------------
            aiTurnRandom();
            printMap();
            if (checkWin(DOT_O)) {
//                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    //-------------------------------------------------------------------------------------------------------
    public static void customizeGame() {
        do {
            System.out.println("\n Введите размер поля [3-10]: ");
            size = sc.nextInt();
        } while (size < 3 || size > 10);
        do {
            System.out.println("Максимальная длина ряда для победы? [3-" + size);
            block = sc.nextInt();
        } while (block < 3 || block > size);
    }

    //-------------------------------------------------------------------------------------------------------
    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //-------------------------------------------------------------------------------------------------------
    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //-------------------------------------------------------------------------------------------------------
    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    //-------------------------------------------------------------------------------------------------------
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    //-------------------------------------------------------------------------------------------------------
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X, Y:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    //-------------------------------------------------------------------------------------------------------
    public static void aiTurnRandom() {
        int x, y;
        do {
            x = randomStep.nextInt(size);
            y = randomStep.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;

    }

    //-------------------------------------------------------------------------------------------------------
//    public static void aiTurn() //global
//    {
//        int x = -1;
//        int y = -1;
//        boolean aiWin = false;
//        boolean userWin = false;
//        // aiLevel = 2
//        // Находим выигрышный ход
//        if (aiLevel == 2) {
//            for (int i = 0; i < size; i++) {
//                for (int j = 0; j < size; j++) {
//                    if (!isCellValid(i, j)) {
//                        map[i][j] = DOT_O;
//                        if (checkWin(DOT_O)) {
//                            x = i;
//                            y = j;
//                            aiWin = true;
//                        }
//                        map[i][j] = DOT_EMPTY;
//                    }
//                }
//            }
//        }
//        // aiLevel = 1
//        // Блокировка хода пользователя, если он побеждает на следующем ходу
//        if (aiLevel > 0) {
//            if (!aiWin) {
//                for (int i = 0; i < size; i++) {
//                    for (int j = 0; j < size; j++) {
//                        if (!isCellValid(i, j)) {
//                            map[i][j] = DOT_X;
//                            if (checkWin(DOT_X)) {
//                                x = i;
//                                y = j;
//                                userWin = true;
//                            }
//                            map[i][j] = DOT_EMPTY;
//                        }
//                    }
//                }
//            }
//        }
//        // aiLevel = 0
//        if (!aiWin && !userWin) {
//            do {
//                Random rnd = new Random();
//                x = rnd.nextInt(size);
//                y = rnd.nextInt(size);
//            }
//            while (isCellValid(x, y));
//        }
//        map[x][y] = DOT_O;
//    }

    //-------------------------------------------------------------------------------------------------------
    public static boolean checkWin0(char symbol) {
        int lenghWinLine = 0; // длина цепочки
        for (int i = 0; i < size; i++) { //горизонтали
            for (int j = 0; j < size; j++) {
                if (map[j][i] == symbol) {
                    lenghWinLine++;
                } else {
                    lenghWinLine = 0;
                }
            }
            if (lenghWinLine == block) return true;
        }
        lenghWinLine = 0;
        for (int i = 0; i < size; i++) { //вертикали
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symbol) {
                    lenghWinLine++;
                } else {
                    lenghWinLine = 0;
                }
            }
            if (lenghWinLine == block) return true;
        }
        lenghWinLine = 0;
        for (int i = (1 - size); i < size; i++) { // диагональ право вниз
            int k = i; //заменяем, чтоб не менялась основная переменная цикла
            for (int j = 0; j < size; j++) {
                if (k >= 0 && k < size && j >= 0 && j < size) {
                    if (map[k][j] == symbol) {
                        lenghWinLine++;
                    } else {
                        lenghWinLine = 0;
                    }
                    k++;
                }
            }
            if (lenghWinLine == block) return true;
        }
        lenghWinLine = 0;
        for (int i = (size + (size - 1)); i < size; i++) { // диагональ право вниз
            int k = i; //заменяем, чтоб не менялась основная переменная цикла
            for (int j = 0; j < size; j++) {
                if (k >= 0 && k < size && j >= 0 && j < size) {
                    if (map[k][j] == symbol) {
                        lenghWinLine++;
                    } else {
                        lenghWinLine = 0;
                    }
                    k++;
                }
            }
            if (lenghWinLine == block) return true;
        }
        return false;
    }

    //-------------------------------------------------------------------------------------------------------
    public static boolean checkWin(char symbol) {
        for (int col = 0; col < size - block + 1; col++) {
            for (int row = 0; row < size - block + 1; row++) {
                if (checkDiagonal(symbol, col, row) || checkLines(symbol, col, row)) return true;
            }
        }
        return false;
    }

    //-------------------------------------------------------------------------------------------------------
    public static boolean checkDiagonal(char symbol, int offsetX, int offsetY) {
        boolean toRight = true;
        boolean toLeft = true;
        for (int i = 0; i < block; i++) {
            toRight &= (map[i + offsetX][i + offsetY] == symbol);
            toLeft &= (map[block - i - 1 + offsetX][i + offsetY] == symbol);
        }
        return toRight || toLeft;
    }

    //-------------------------------------------------------------------------------------------------------
    public static boolean checkLines(char symbol, int offsetX, int offsetY) {
        for (int col = offsetX; col < block + offsetX; col++) {
            boolean cols = true;
            boolean rows = true;
            for (int row = offsetX; row < block + offsetY; row++) {
                cols &= (map[col][row] == symbol);
                rows &= (map[row][col] == symbol);
            }
            if (cols || rows) return true;
        }
        return false;
    }

}
