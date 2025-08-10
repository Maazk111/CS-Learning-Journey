import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

class Employee implements Comparable<Employee> {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + '}';
    }
}

class DynamicArray {
    public static Employee[] insertEmployee(Employee[] arr, Employee emp) {
        Employee[] newArr = new Employee[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = emp;
        return newArr;
    }

    public static int linearSearch(Employee[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Employee[] arr, String name, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid].getName().equalsIgnoreCase(name)) {
            return mid;
        } else if (arr[mid].getName().compareToIgnoreCase(name) < 0) {
            return binarySearch(arr, name, mid + 1, high);
        } else {
            return binarySearch(arr, name, low, mid - 1);
        }
    }

    public static boolean simpleProbabilisticSearch(Employee[] arr, String name) {
        Random random = new Random();
        int attempts = 0;
        int maxAttempts = arr.length * 2;  // Arbitrary limit to avoid infinite loop

        while (attempts < maxAttempts) {
            int index = random.nextInt(arr.length);
            if (arr[index].getName().equalsIgnoreCase(name)) {
                System.out.println("Found '" + name + "' at index " + index + " after " + attempts + " attempts.");
                return true;
            }
            attempts++;
        }
        System.out.println("'" + name + "' not found after " + maxAttempts + " attempts.");
        return false;
    }

    public static boolean sentinelSearch(Employee[] arr, String name) {
        int i = 0;
        int n = arr.length;
        String last = arr[n - 1].getName();

        arr[n - 1] = new Employee(name, -1);  // Sentinel
        while (!arr[i].getName().equalsIgnoreCase(name)) {
            i++;
        }

        arr[n - 1] = new Employee(last, -1);  // Restore last element
        return i < n - 1 || arr[n - 1].getName().equalsIgnoreCase(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[0];
        String fileName = "EmployeeData.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Employee emp = new Employee(parts[0], Integer.parseInt(parts[1].trim()));
                employees = DynamicArray.insertEmployee(employees, emp);
                System.out.println("Employee Added: " + emp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Linear search
        String searchName = "Maaz khan";
        System.out.println("\nPerforming Linear Search for: " + searchName);
        int index = DynamicArray.linearSearch(employees, searchName);
        if (index != -1) {
            System.out.println("Employee found (Linear Search): " + employees[index]);
        } else {
            System.out.println("Employee not found (Linear Search)");
        }

        // Binary search (requires sorted array)
        Arrays.sort(employees);
        System.out.println("\nSorted Employees:");
        for (Employee emp : employees) {
            System.out.println(emp); // Print sorted employees
        }

        System.out.println("\nPerforming Binary Search for: " + searchName);
        index = DynamicArray.binarySearch(employees, searchName, 0, employees.length - 1);
        if (index != -1) {
            System.out.println("Employee found (Binary Search): " + employees[index]);
        } else {
            System.out.println("Employee not found (Binary Search)");
        }

        // Simple Probabilistic Search
        System.out.println("\nPerforming Simple Probabilistic Search for: " + searchName);
        boolean found = DynamicArray.simpleProbabilisticSearch(employees, searchName);
        if (!found) {
            System.out.println("Employee not found (Simple Probabilistic Search)");
        }

        // Sentinel Search
        System.out.println("\nPerforming Sentinel Search for: " + searchName);
        found = DynamicArray.sentinelSearch(employees, searchName);
        if (found) {
            System.out.println("Employee found (Sentinel Search)");
        } else {
            System.out.println("Employee not found (Sentinel Search)");
        }
    }
}
