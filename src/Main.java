public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Климова Вера Никитична", 18000, 1);
        employees[1] = new Employee("Дубов Денис Иванович", 19000, 2);
        employees[2] = new Employee("Иванов Алексей Эмирович", 17000, 5);
        employees[3] = new Employee("Авдеева Анна Кирилловна", 20000, 4);
        employees[4] = new Employee("Кузнецова Варвара Демидовна", 25000, 3);
        employees[5] = new Employee("Терентьева Алина Никитична", 19000, 5);
        employees[6] = new Employee("Фомичев Роман Даниилович", 26000, 4);
        employees[7] = new Employee("Федорова Мария Васильевна", 22000, 2);
        employees[8] = new Employee("Поликарпова Варвара Алексеевна", 22000, 3);
        employees[9] = new Employee("Матвеева Валерия Степановна", 25000, 1);

        System.out.println();
        System.out.println("а. Список всех сотрудников со всеми имеющимися по ним данными:");
        BaseDifficult.printEmployees(employees);

        System.out.println();
        System.out.println("b. Сумма затрат на зарплаты в месяц: " + BaseDifficult.calculateToSalary(employees) + " руб.");

        System.out.println();
        System.out.println("c. Сотрудник с минимальной зарплатой: " + BaseDifficult.findEmployeeWithMinSalary(employees));

        System.out.println();
        System.out.println("d. Сотрудник с максимальной зарплатой: " + BaseDifficult.findEmployeeWithMaxSalary(employees));

        System.out.println();
        System.out.println("e. Среднее значение зарплат: " + BaseDifficult.calculateAverageSalary(employees) + " pуб.");

        System.out.println();
        System.out.println("f. Ф. И. О. всех сотрудников (вывести в консоль):");
        BaseDifficult.printFullNames(employees);
    }
}