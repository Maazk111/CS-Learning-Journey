import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    int rollNumber;
    float cgpa;
    List<Integer> courses = new ArrayList<>();

    public Student(String firstName, String lastName, int rollNumber, float cgpa, List<Integer> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        this.courses.addAll(courses);
    }
}

class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("====== Add the Students Details ======");
        System.out.print("Enter the first name of student: ");
        String firstName = scanner.next();
        System.out.print("Enter the last name of student: ");
        String lastName = scanner.next();
        System.out.print("Enter the Roll Number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter the CGPA you obtained: ");
        float cgpa = scanner.nextFloat();
        List<Integer> courses = new ArrayList<>();
        System.out.println("Enter the courses (5 courses, enter one by one): ");
        for (int j = 0; j < 5; j++) {
            courses.add(scanner.nextInt());
        }
        students.add(new Student(firstName, lastName, rollNumber, cgpa, courses));
        System.out.println("STUDENT DETAILS SUCCESSFULLY RECORDED");
    }

    public void findStudentByRollNumber() {
        System.out.print("Enter the Roll Number of the student: ");
        int rollNumber = scanner.nextInt();
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                printStudentDetails(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void findStudentByFirstName() {
        System.out.print("Enter the First Name of the student: ");
        String firstName = scanner.next();
        for (Student student : students) {
            if (student.firstName.equalsIgnoreCase(firstName)) {
                printStudentDetails(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void findStudentsByCourseId() {
        System.out.print("Enter the course ID: ");
        int courseId = scanner.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.courses.contains(courseId)) {
                printStudentDetails(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found enrolled in course ID " + courseId);
        }
    }

    public void totalStudents() {
        System.out.println("The total number of students is: " + students.size());
    }

    public void deleteStudentByRollNumber() {
        System.out.print("Enter the Roll Number which you want to delete: ");
        int rollNumber = scanner.nextInt();
        students.removeIf(student -> student.rollNumber == rollNumber);
        System.out.println("The student with Roll Number " + rollNumber + " is removed successfully.");
    }

    public void updateStudentDetails() {
        System.out.print("Enter the roll number to update the entry: ");
        int rollNumber = scanner.nextInt();
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                System.out.println("Select the information you want to update: ");
                System.out.println("1. First name");
                System.out.println("2. Last name");
                System.out.println("3. Roll number");
                System.out.println("4. CGPA");
                System.out.println("5. Courses");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the new first name: ");
                        student.firstName = scanner.next();
                        break;
                    case 2:
                        System.out.print("Enter the new last name: ");
                        student.lastName = scanner.next();
                        break;
                    case 3:
                        System.out.print("Enter the new roll number: ");
                        student.rollNumber = scanner.nextInt();
                        break;
                    case 4:
                        System.out.print("Enter the new CGPA: ");
                        student.cgpa = scanner.nextFloat();
                        break;
                    case 5:
                        System.out.println("Enter the new courses (5 courses, enter one by one): ");
                        student.courses.clear();
                        for (int j = 0; j < 5; j++) {
                            student.courses.add(scanner.nextInt());
                        }
                        break;
                }
                System.out.println("UPDATED SUCCESSFULLY.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private void printStudentDetails(Student student) {
        System.out.println("The Student's Details are:");
        System.out.println("First Name: " + student.firstName);
        System.out.println("Last Name: " + student.lastName);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("CGPA: " + student.cgpa);
        System.out.print("Courses: ");
        for (int course : student.courses) {
            System.out.print(course + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        while (true) {
            System.out.println("===== STUDENT REPORT CARD SYSTEM =====");
            System.out.println("1. Add Student Details");
            System.out.println("2. Find Student Details by Roll Number");
            System.out.println("3. Find Student Details by First Name");
            System.out.println("4. Find Student Details by Course ID");
            System.out.println("5. Total number of Students");
            System.out.println("6. Delete Student Details by Roll Number");
            System.out.println("7. Update Student Details by Roll Number");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sms.scanner.nextInt();
            switch (choice) {
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    sms.findStudentByRollNumber();
                    break;
                case 3:
                    sms.findStudentByFirstName();
                    break;
                case 4:
                    sms.findStudentsByCourseId();
                    break;
                case 5:
                    sms.totalStudents();
                    break;
                case 6:
                    sms.deleteStudentByRollNumber();
                    break;
                case 7:
                    sms.updateStudentDetails();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
