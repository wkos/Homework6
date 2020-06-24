package pl.wkos.homewrok62;

public class EmployeeUtils {
    public double totalSalary(Employee[] employees) {
        double salaries = 0.0;
        for (Employee item : employees)
            salaries += item.salary;
        return salaries;
    }
}
