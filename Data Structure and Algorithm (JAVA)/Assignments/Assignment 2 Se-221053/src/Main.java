import java.io.*;
import java.util.*;

class Employee {
    String name;


    public Employee(String name) {
        this.name = name;
    }

}

class Sorting_Algos {
    public void BubbleSort(String[][] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j][0].compareTo(data[j + 1][0]) > 0) {
                    // Swap rows j and j+1
                    String[] temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void InsertionSort(String[][] data) {
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            String[] key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j][0].compareTo(key[0]) > 0) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public void SelectionSort(String[][] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (data[j][0].compareTo(data[min_idx][0]) < 0)
                    min_idx = j;


            String[] temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }

    public void MergeSort(String[][] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            MergeSort(data, left, middle);
            MergeSort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    private void merge(String[][] data, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        String[][] L = new String[n1][];
        String[][] R = new String[n2][];

        for (int i = 0; i < n1; ++i)
            L[i] = data[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = data[middle + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i][0].compareTo(R[j][0]) <= 0) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            String[][] employeeData = readDataFromFile("EmployeeData.txt");

            Sorting_Algos sortingAlgos = new Sorting_Algos();


            sortingAlgos.BubbleSort(employeeData);
            printData(employeeData);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[][] readDataFromFile(String filename) throws IOException {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line.split(","));
            }
        }
        return data.toArray(new String[0][]);
    }

    private static void printData(String[][] data) {
        for (String[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}
