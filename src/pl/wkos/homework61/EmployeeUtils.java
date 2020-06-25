package pl.wkos.homework61;

public class EmployeeUtils {
    public double totalSalary(Employee[] employees) {
        double salaries = 0.0;
        for (Employee item : employees)
            salaries += item.getSalary();
        return salaries;
    }
}
