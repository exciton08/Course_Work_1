public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateToSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateToSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void main(String[] args) {
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
        printEmployees();

        System.out.println();
        System.out.println("b. Сумма затрат на зарплаты в месяц: " + calculateToSalary() + " руб.");

        System.out.println();
        System.out.println("c. Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());

        System.out.println();
        System.out.println("d. Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());

        System.out.println();
        System.out.println("e. Среднее значение зарплат: " + calculateAverageSalary() + " pуб.");

        System.out.println();
        System.out.println("f. Ф. И. О. всех сотрудников (вывести в консоль):");
        printFullNames();
    }
}