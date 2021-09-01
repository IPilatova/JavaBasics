package Homework;

public class HomeWorkAppL5 {

    public static void main(String[] args) {

//    4. Создать массив из 5 сотрудников.
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//...
//    persArray[4] = new Person(...);

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Pupkin", "Vasiliy", "Ivanovich","Engineer", "pupkin@gmail.com", "234", 2000, 45);
        employeeArray[1] = new Employee("Tupkin", "Ivan", "Ivanovich","Manager", "tupkin@gmail.com", "345", 2000, 35);
        employeeArray[2] = new Employee("Kupkin", "Vasiliy", "Petrovich","Programmer", "kupkin@gmail.com", "456", 3000, 32);
        employeeArray[3] = new Employee("Lupkin", "Ivan", "Petrovich","Manager", "lupkin@gmail.com", "567", 2000, 40);
        employeeArray[4] = new Employee("Rupkin", "Vasiliy", "Ivanovich","Programmer", "rupkin@gmail.com", "678", 4000, 42);

        ageEmployee(employeeArray);

    }
    //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public static void ageEmployee (Employee[] employeeArray) {
        for (int i = 0; i < 5; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].info();
                System.out.println("======================");
            }
        }
    }
}
