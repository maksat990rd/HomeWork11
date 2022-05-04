package com.company;

public class DoubleArray {
    public static void main(String[] args) {
        char[][] array = new char[3][3];

        array[0][0] = 'x'; // 1
        array[0][1] = 'o'; // 2
        array[0][2] = 'x'; // 3
        array[1][0] = 'o'; // 4
        array[1][1] = 'x'; // 5
        array[1][2] = 'o'; // 6
        array[2][0] = 'o'; // 7
        array[2][1] = 'o'; // 8
        array[2][2] = 'x'; // 9

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        }
    }