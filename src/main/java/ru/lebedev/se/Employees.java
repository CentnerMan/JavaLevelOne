package ru.lebedev.se;

public class Employees {

    public static void main(String[] args) {
        Employee[] EmployeeArray = new Employee[5];
        EmployeeArray[0] = new Employee("Иванов Иван", "Инженер", "ivanov@work.ru", "+78121111111", 30000, 45);
        EmployeeArray[1] = new Employee("Петров Петр", "Менеджер", "+78122222222", 40000, 38);
        EmployeeArray[2] = new Employee("Сидоров Сидор", "Бухгалтер", 45000, 42);
        EmployeeArray[3] = new Employee("Неизвестный Эрнст", "Директор", "+74952222222",100000, 60);
        EmployeeArray[4] = new Employee("Львов Лев", "Программист", "lviv@work.ru", "+78125555555", 14000, 31);

        for (int i = 0; i < EmployeeArray.length; i++) {
            if (EmployeeArray[i].getAge() > 40) {
                EmployeeArray[i].printInfo();
            }
        }
    }
}
