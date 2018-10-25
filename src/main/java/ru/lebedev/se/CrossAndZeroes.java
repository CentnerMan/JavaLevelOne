package ru.lebedev.se;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Анатолий Лебедев
 * @version 1.0.0
 */

public class CrossAndZeroes {
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner scanStep = new Scanner(System.in);
    public static Random randomStep = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
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
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X, Y:");
            x = scanStep.nextInt() - 1;
            y = scanStep.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = randomStep.nextInt(SIZE);
            y = randomStep.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;

    }

    public static boolean checkWin(char symbol) {
        int longestLine = 0; //максимальная длина цепочки
        for (int i = 0; i < SIZE; i++) { //горизонтали
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    longestLine++;
                } else {
                    longestLine = 0;
                }
            }
            if (longestLine == DOTS_TO_WIN) return true;
        }
        for (int i = 0; i < SIZE; i++) { //вертикали
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symbol) {
                    longestLine++;
                } else {
                    longestLine = 0;
                }
            }
            if (longestLine == DOTS_TO_WIN) return true;
        }
        for (int i = 0; i < SIZE; i++) { // диагональ право вниз
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    longestLine++;
                } else {
                    longestLine = 0;
                }
            }
            if (longestLine == DOTS_TO_WIN) return true;
        }
        return false;
    }
}
