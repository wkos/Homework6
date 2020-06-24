package pl.wkos.homework61;

public class EmployeesTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        EmployeeRead employeeRead = new EmployeeRead();
        for (int i = 0; i < 2; i++)
            employees[i] = employeeRead.readFromConsole();
        System.out.println("Lista pracowników:");
        for (int i = 0; i < 2; i++)
            System.out.println(employees[i].toString());
        EmployeeUtils employeeUtils = new EmployeeUtils();
        System.out.print("Wynagrodzenie wszystkich pracowników wynosi: " + employeeUtils.totalSalary(employees));
    }
}
