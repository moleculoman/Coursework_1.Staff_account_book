import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[10];
        Employees[0] = new Employee("Иванов Иван Иванович", 1, 45000);
        Employees[1] = new Employee("Петров Игнат Петрович", 2, 35000);
        Employees[2] = new Employee("Сидоров Семен Андреевич", 1, 55500);
        Employees[3] = new Employee("Шустов Сергей Валерьевич", 2, 42750);
        System.out.println("Первый метод:");
        System.out.println(allInformation(Employees));
        System.out.println("Второй метод:");
        System.out.println(allSalary(Employees));
        System.out.println("Третий метод:");
        System.out.println(lowestSalary(Employees));
        System.out.println("Четвертый метод:");
        System.out.println(biggestSalary(Employees));
        System.out.println("Пятый метод:");
        System.out.println(averageSalary(Employees));
        System.out.println("Шестой метод:");
        System.out.println(allFIO(Employees));
    }

    //Метод для вывода всей информации по сотрудникам
    public static String allInformation(Employee[] Employees) {
        for (Employee employee : Employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
        return "Выведен актуальный список сотрудников";
    }

    // Метод для вывода общей суммы ЗП
    public static String allSalary(Employee[] Employees) {
        float sum = 0;
        for (Employee employee : Employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return "Сумма заработной платы среди всех сотрудников составляет " + sum + " рублей.";
    }

    //Метод для поиска сотрудника с минимальной зарплатой.
    public static String lowestSalary(Employee[] Employees) {
        Employee lowestSalary = Employees[0];
        for (int index = 0; index < Employees.length; index++) {
            if (Employees[index] != null && lowestSalary.getSalary() > Employees[index].getSalary()) {
                lowestSalary = Employees[index];
            }
        }
        return "Сотрудником с минимальной зарплатой является: " + lowestSalary;
    }

    //Метод для поиска сотрудника с максимальной зарплатой.
    public static String biggestSalary(Employee[] Employees) {
        Employee biggestSalary = Employees[0];
        for (int index = 0; index < Employees.length; index++) {
            if (Employees[index] != null && biggestSalary.getSalary() < Employees[index].getSalary()) {
                biggestSalary = Employees[index];
            }
        }
        return "Сотрудником с максимальной зарплатой является: " + biggestSalary;
    }

    //Метод для поиска средней зарплаты
    public static String averageSalary(Employee[] Employees) {
        ArrayList<Employee[]> arrlist = new ArrayList<>(10);
        double sum = 0;
        double retval = 0;
        double result = 0;
        for (Employee employee : Employees) {
            if (employee != null) {
                arrlist.add(Employees);
                retval = arrlist.size();
                sum += employee.getSalary();
                result = sum / retval;
            }
        }
        return "Средняя заработная плата среди всех сотрудников составляет: " + result + " рублей.";
    }

    //Метод для выведения всех Ф.И.О. сотрудников
    public static String allFIO(Employee[] Employees){
        for (Employee employee : Employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
        return "Выведен актуальный список Ф.И.О. сотрудников";
    }
}