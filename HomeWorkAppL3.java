package Homework;

public class HomeWorkAppL3 {

    public static void main(String[] args) {

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int [] arrayChangeZeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArrayElement(arrayChangeZeroOne);
        readArray(arrayChangeZeroOne);

//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int [] emptyIntArray = new int[100];
        fillEmptyArray(emptyIntArray);
        readArray(emptyIntArray);

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int [] arrayChangeLess6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeNumLess6(arrayChangeLess6);
        readArray(arrayChangeLess6);

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        fillArrayDiagonals(5, 5);

//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        lenInitialValue(10, 5);

//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int [] arrayMinMaxElements = {1, 5, 3, -2, 11, 4, 5, 2, 4, 8, 9, 1};
        numMinMax(arrayMinMaxElements);
    }


//  Метод для печати массива дл заданий 1-3
    public static void readArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changeArrayElement(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 1) {
                inputArray[i] = 0;
            } else {
                inputArray[i] = 1;
            }
        }
    }

//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillEmptyArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = i + 1;
        }
    }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeNumLess6(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 6) {
                inputArray[i] = inputArray[i] * 2;
            }
        }
    }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillArrayDiagonals(int height, int width) {
        if (height == width) {
            int[][] table = new int[height][width];
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if ((y == x) || (y + x == width - 1)) {
                        table[y][x] = 1;
                    }
                }
            }
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    System.out.print(table[y][x] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Массив не квадратный. Количество строк и столбцов разное");
        }
    }

//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] lenInitialValue(int len, int initialValue) {
        int[] arrayInitialValue = new int[len];
        for (int i = 0; i < arrayInitialValue.length; i++) {
            arrayInitialValue[i] = initialValue;
            System.out.print(arrayInitialValue[i] + "\t");
        }
        System.out.println();
        return arrayInitialValue;
    }

//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void numMinMax (int [] inputArray) {
        int min = inputArray[0];
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
           if (inputArray[i] < min) {
               min = inputArray[i];
           }
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }
        System.out.println("Mинимальный элемент массива > " + min);
        System.out.println("Максимальный элемент массива > " + max);
    }
}
