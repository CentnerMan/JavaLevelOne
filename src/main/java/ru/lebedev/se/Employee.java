package ru.lebedev.se;

public class Employee {
    private String fio;
    private String position;
    private String email = "ouroffice@ourwork.com"; // Если нет своей электронной почты, ставим рабочую
    private String phoneNumber = "+78122233322"; // Если нет телефона - ставим рабочий
    private int salary;
    private int age;

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            this.age = age *(-1); // Переводим отрицательный возраст в положительный
    }

    public int getAge() {
        return age;
    }

    public Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
        setFio(fio);
        setPosition(position);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setAge(age);
    }

    public Employee(String fio, String position, String phoneNumber, int salary, int age) {
        setFio(fio);
        setPosition(position);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setAge(age);
    }

    public Employee(String fio, String position, int salary, int age) {
        setFio(fio);
        setPosition(position);
        setSalary(salary);
        setAge(age);
    }

    public void printInfo() {
        System.out.println("Ф.И.О.: " + this.fio + ", Должность: " + this.position + ", Электронная почта: "
                + this.email + ", Телефон: " + this.phoneNumber + ", Зарплата: " + this.salary
                + ", Возраст: " + this.age);
    }

}


