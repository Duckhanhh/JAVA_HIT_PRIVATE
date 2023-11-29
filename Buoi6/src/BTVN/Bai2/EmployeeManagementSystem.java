package BTVN.Bai2;

import java.util.*;

public class EmployeeManagementSystem {
    private final List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Payment per hour: " + employee.getPaymentPerHour());
            if (employee instanceof PartTimeEmployee) {
                PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
                System.out.println("Working hours: " + partTimeEmployee.getWorkingHours());
            }
            System.out.println();
        }
    }

    public void sortEmployeesBySalaryDescending() {
        employees.sort(Comparator.comparingDouble(Employee::calculateSalary).reversed());
    }

    public Employee findEmployeeWithMostWorkingHours() {
        Employee employeeWithMostWorkingHours = null;
        double maxWorkingHours = 0;

        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
                if (partTimeEmployee.getWorkingHours() > maxWorkingHours) {
                    maxWorkingHours = partTimeEmployee.getWorkingHours();
                    employeeWithMostWorkingHours = employee;
                }
            }
        }

        return employeeWithMostWorkingHours;
    }

    public void removeEmployeeWithLeastWorkingHours() {
        Employee employeeWithLeastWorkingHours = null;
        double minWorkingHours = Double.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
                if (partTimeEmployee.getWorkingHours() < minWorkingHours) {
                    minWorkingHours = partTimeEmployee.getWorkingHours();
                    employeeWithLeastWorkingHours = employee;
                }
            }
        }

        if (employeeWithLeastWorkingHours != null) {
            employees.remove(employeeWithLeastWorkingHours);
            System.out.println("Removed employee: " + employeeWithLeastWorkingHours.getName());
        } else {
            System.out.println("No part-time employees found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add an employee");
            System.out.println("2. Print all employees");
            System.out.println("3. Sort employees by salary (descending)");
            System.out.println("4. Find employee with most working hours");
            System.out.println("5. Remove employee with least working hours");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the part-time employee: ");
                    String partTimeEmployeeName = scanner.nextLine();
                    System.out.print("Enter the payment per hour for the part-time employee: ");
                    int partTimeEmployeePaymentPerHour = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the working hours for the part-time employee: ");
                    int partTimeEmployeeWorkingHours = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    PartTimeEmployee partTimeEmployee = new PartTimeEmployee(partTimeEmployeeName, partTimeEmployeePaymentPerHour, partTimeEmployeeWorkingHours);
                    employeeManagementSystem.addEmployee(partTimeEmployee);
                    System.out.println("Added part-time employee: " + partTimeEmployee.getName());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter the name of the full-time employee: ");
                    String fullTimeEmployeeName = scanner.nextLine();
                    System.out.print("Enter the payment per hour for the full-time employee: ");
                    int fullTimeEmployeePaymentPerHour = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(fullTimeEmployeeName,
                            fullTimeEmployeePaymentPerHour);
                    employeeManagementSystem.addEmployee(fullTimeEmployee);
                    System.out.println("Added full-time employee: " + fullTimeEmployee.getName());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("All employees:");
                    employeeManagementSystem.printAllEmployees();
                    break;
                case 4:
                    employeeManagementSystem.sortEmployeesBySalaryDescending();
                    System.out.println("Employees sorted by salary (descending):");
                    employeeManagementSystem.printAllEmployees();
                    break;
                case 5:
                    Employee employeeWithMostWorkingHours = employeeManagementSystem.findEmployeeWithMostWorkingHours();
                    if (employeeWithMostWorkingHours != null) {
                        System.out.println("Employee with the most working hours:");
                        System.out.println("Name: " + employeeWithMostWorkingHours.getName());
                        System.out.println("Working hours: " + ((PartTimeEmployee) employeeWithMostWorkingHours).getWorkingHours());
                    } else {
                        System.out.println("No part-time employees found.");
                    }
                    System.out.println();
                    break;
                case 6:
                    employeeManagementSystem.removeEmployeeWithLeastWorkingHours();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                    break;
            }
        }
    }
}
