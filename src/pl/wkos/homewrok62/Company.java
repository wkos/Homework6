package pl.wkos.homewrok62;

import java.util.Arrays;

public class Company {
    private Employee[] employees;

    public Company(int size) {
        this.employees = new Employee[size];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    void add(Employee emp) {
        int i = 0;
        while (i < employees.length && employees[i] != null) i++;
        if (i < employees.length) employees[i] = emp;
        else System.out.println("Brak miejsca w tablicy");
    }

    Employee get(int index) {
        return employees[index];
    }

    @Override
    public String toString() {
        String buffer = "Lista pracowników\n";
        for (Employee item : employees)
            buffer += item.toString() + "\n";
        return buffer;
    }
}
