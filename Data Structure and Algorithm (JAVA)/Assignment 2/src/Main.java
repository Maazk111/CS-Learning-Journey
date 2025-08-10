import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
class Employee {
    int id;
    String name;
    String department;
    double salary;
    double bonus;

    public Employee(int id, String name, String department, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}

class EmployeeSorter {

    static ArrayList<Employee> readFile(String fileName) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                String department = values[2];
                double salary = Double.parseDouble(values[3]);
                double bonus = Double.parseDouble(values[4]);
                employees.add(new Employee(id, name, department, salary, bonus));
            }
        }
        return employees;
    }

    static void bubbleSort(ArrayList<Employee> employees) {
        int n = employees.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (employees.get(j).name.compareTo(employees.get(j + 1).name) > 0) {
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }
    }

    static void selectionSort(ArrayList<Employee> employees) {
        int n = employees.size();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (employees.get(j).name.compareTo(employees.get(min_idx).name) < 0) {
                    min_idx = j;
                }
            }
            Employee temp = employees.get(min_idx);
            employees.set(min_idx, employees.get(i));
            employees.set(i, temp);
        }
    }

    static void insertionSort(ArrayList<Employee> employees) {
        int n = employees.size();
        for (int i = 1; i < n; i++) {
            Employee key = employees.get(i);
            int j = i - 1;

            while (j >= 0 && employees.get(j).name.compareTo(key.name) > 0) {
                employees.set(j + 1, employees.get(j));
                j = j - 1;
            }
            employees.set(j + 1, key);
        }
    }

    private static void merge(ArrayList<Employee> employees, int l, int m, int r) {
        ArrayList<Employee> left = new ArrayList<>(employees.subList(l, m + 1));
        ArrayList<Employee> right = new ArrayList<>(employees.subList(m + 1, r + 1));

        int i = 0, j = 0;
        int k = l;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).name.compareTo(right.get(j).name) <= 0) {
                employees.set(k, left.get(i));
                i++;
            } else {
                employees.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            employees.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            employees.set(k, right.get(j));
            j++;
            k++;
        }
    }

    static void mergeSort(ArrayList<Employee> employees, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(employees, l, m);
            mergeSort(employees, m + 1, r);
            merge(employees, l, m, r);
        }
    }

    static void printEmployees(ArrayList<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Employee> employees = EmployeeSorter.readFile("EmplyeeData.txt");

            System.out.println("Original List:");
            EmployeeSorter.printEmployees(employees);

            ArrayList<Employee> sortedEmployees = new ArrayList<>(employees);
            EmployeeSorter.bubbleSort(sortedEmployees);
            System.out.println("\nSorted by Bubble Sort:");
            EmployeeSorter.printEmployees(sortedEmployees);

            sortedEmployees = new ArrayList<>(employees);
            EmployeeSorter.selectionSort(sortedEmployees);
            System.out.println("\nSorted by Selection Sort:");
            EmployeeSorter.printEmployees(sortedEmployees);

            sortedEmployees = new ArrayList<>(employees);
            EmployeeSorter.insertionSort(sortedEmployees);
            System.out.println("\nSorted by Insertion Sort:");
            EmployeeSorter.printEmployees(sortedEmployees);

            sortedEmployees = new ArrayList<>(employees);
            EmployeeSorter.mergeSort(sortedEmployees, 0, sortedEmployees.size() - 1);
            System.out.println("\nSorted by Merge Sort:");
            EmployeeSorter.printEmployees(sortedEmployees);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
