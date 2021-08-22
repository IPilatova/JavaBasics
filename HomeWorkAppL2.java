package Homework;

public class HomeWorkAppL2 {

    public static void main(String[] args) {

        System.out.println(sumLimit(-10,20));
        System.out.println("Результат выполнения задания 1 => " + sumLimit1(20,10));

        numValue (1);

        System.out.println(numValueBoolean(1));
        String result = (isNegative(20)) ? "Number is negative" : "Number is positive";
        System.out.println(result);

        forNumRaw("Строку, которую нужно написать n раз", 3);

        System.out.println(Year(2020));

    }

// 1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//    в противном случае – false.

    public static boolean sumLimit(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static boolean sumLimit1(int first, int second) {
        return (first + second >= 10) && (first + second <= 20);
    }

// 2. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.

    public static void numValue(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

// 3. Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean numValueBoolean(int a) {
        return (a < 0);
    }

    public static boolean isNegative(int variable) {
        return variable < 0;
    }

// 4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void forNumRaw(String r, int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(r);
        }
    }

// 5.* Написать метод, который определяет, является ли год високосным,
//    и возвращает boolean (високосный - true, не високосный - false).
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean Year(int year) {
        return (year % 4 == 0) && (year %100 !=0) || (year % 400 == 0);
    }

//    public static boolean Year(int year) { // Так делать НЕ НУЖНО
//        if (year % 400 == 0) {
//            return true;
//        } else if (year % 100 == 0) {
//            return false;
//        } else if (year % 4 == 0) {
//            return true;
//        }
//        return false;
//    }

}