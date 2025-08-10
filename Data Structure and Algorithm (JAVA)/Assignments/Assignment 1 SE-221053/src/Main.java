import java.io.*;
import java.util.*;

class Employee {
    String name;
    // Other attributes can be added as necessary

    public Employee(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeDatabase {
    private ArrayList<Employee> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public void readFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(new Employee(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Linear Search
    public boolean linearSearch(String name) {
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Probabilistic Search
    public boolean probabilisticSearch(String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                if (i != 0) {
                    Collections.swap(employees, i, i - 1);
                }
                return true;
            }
        }
        return false;
    }

    // Sentinel Search
    public boolean sentinelSearch(String name) {
        employees.add(new Employee(name)); // Add sentinel
        int i = 0;
        while (!employees.get(i).getName().equals(name)) {
            i++;
        }
        employees.remove(employees.size() - 1); // Remove sentinel

        return i < employees.size();
    }

    // Binary Search (requires sorted list)
    public boolean binarySearch(String name) {
        int start = 0;
        int end = employees.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = name.compareTo(employees.get(mid).getName());

            if (res == 0)
                return true;
            if (res > 0)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    // Sort employees by name for binary search
    public void sortByName() {
        Collections.sort(employees, Comparator.comparing(Employee::getName));
    }

    // Other methods...
}

public class Main {
    public static void main(String[] args) {
        EmployeeDatabase db = new EmployeeDatabase();
        db.readFromFile("EmployeeList.txt"); // The file must contain one employee name per line

        // Sort the database for binary search
        db.sortByName();

        // Testing different search algorithms
        System.out.println("Linear Search: " + db.linearSearch("Junaid Hassan"));
        System.out.println("Probabilistic Search: " + db.probabilisticSearch("Arsalan Khan"));
        System.out.println("Sentinel Search: " + db.sentinelSearch("Sana Sheikh"));
        System.out.println("Binary Search: " + db.binarySearch("Rumaisa "));
    }
}
