package Homework;

// Задание 1 - Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
public class HomeWorkAppL1 {

    public static void main(String[] args) {

// Задание 6
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


        if (checkSumSign1(55, 99)) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

        System.out.println("Результат: " + printcolor1(100));
        System.out.println(compareNumbers1(20,15));
    }

// Задание 2 -Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    //Orange
    //Banana
    //Apple
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

// Задание 3 - Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
//Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSumSign() {
        int a = -260;
        int b = 250;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static boolean checkSumSign1(int a1, int b1) {
        return (a1 + b1) >=0;
    }

// Задание 4 - Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//если больше 100 (100 исключительно) - “Зеленый”;
    public static void printColor() {
        int value = 52;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    public static String printcolor1(int value1) {
        if (value1 <=0 ) {
            return ("Красный");
        } else if (value1 > 0 && value1 <= 100) {
            return ("Желтый");
        } else {
            return ("Зеленый");
        }
    }


// Зажание 5 - Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//и инициализируйте их любыми значениями, которыми захотите.
//Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
       int a = 50;
       int b = 130;

       if (a >= b) {
           System.out.println("a >= b");
       } else {
           System.out.println("a < b");
       }
    }

    public static String compareNumbers1 (int a1, int b1) {
        if (a1 >= b1) {
            return "a1 >= b1";
        } else {
            return "a1 < b1";
        }
    }

}


