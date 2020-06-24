package pl.wkos.homewrok62;

public class EmployeesTest {
    public static void main(String[] args) {
        Company company = new Company(2);
        EmployeeRead employeeRead = new EmployeeRead();
        for (int i = 0; i < 2; i++)
            company.add(employeeRead.readFromConsole());
        System.out.println("Lista pracowników:");
        System.out.println(company.toString());
        EmployeeUtils employeeUtils = new EmployeeUtils();
        System.out.print("Wynagrodzenie wszystkich pracowników wynosi: " +
                employeeUtils.totalSalary(company.getEmployees()));
    }
}
