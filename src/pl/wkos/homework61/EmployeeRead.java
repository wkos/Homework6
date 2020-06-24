package pl.wkos.homework61;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeRead {
    public Employee readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Imię pracownika: ");
        String firstName = scanner.nextLine();
        System.out.print("Nazwisko pracownika: ");
        String lastName = scanner.nextLine();
        System.out.print("Wynagrodzenie pracownika: ");
        double salary = scanner.nextDouble();
        return new Employee(firstName, lastName, salary);
    }
}
