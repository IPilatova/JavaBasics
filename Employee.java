package Homework;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {

    private String surName;
    private String name;
    private String secondName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


//2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee (String surName, String name, String secondName, String position, String email, String phone, int salary, int age) {
        this.surName = surName;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    public void info() {
        System.out.println("Employee: " + surName + " " + name + " " + secondName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public int getAge() {
        return this.age;
    }

}
