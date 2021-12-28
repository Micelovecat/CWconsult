package ru.skypro;

public class Medium {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args){
//        addEmployee(new Employee("Иван", "Иванов", "Иванович", 1, 100_000f));
        addEmployee(new Employee("Иван1", "Иванов1", "Иванович", 1, 200_000f));
        addEmployee(new Employee("Иван2", "Иванов2", "Иванович", 1, 300_000f));
        addEmployee(new Employee("Иван3", "Иванов3", "Иванович", 1, 500_000f));
        addEmployee(new Employee("Иван4", "Иванов4", "Иванович", 1, 800_000f));
        printEmployees();
        System.out.println();

        int department = 1;
        System.out.println("Сотрудник с минимальной ЗП в отделе " + department + ":\n" + findMinSalaryEmployeeOfDepartment(department));
        System.out.println("Сотрудник с максиммальной ЗП в отделе " + department + ":\n" + findMaxSalaryEmployeeOfDepartment(department));
        System.out.println();

        System.out.println("Сумма затрат на ЗП по отделу: " + calculateTotalSalaryOfDepartment(department));
        System.out.println();

        System.out.println("Средняя ЗП по отделу: " + calculateAverageSalaryOfTeam(department));
        System.out.println();

        increaseSalaryOfDepartment(department, 10);
        printEmployees();
        System.out.println();


        printFullNames();

    }
}
