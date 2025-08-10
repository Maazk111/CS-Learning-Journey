import java.io.*;
import java.util.*;

public class UserSystem {
    private static final String USER_FILE = "users.txt";

    public void UserManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create Student Account");
            System.out.println("2. Create Teacher Account");
            System.out.println("3. Student Login");
            System.out.println("4. Teacher Login");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount("student");
                    break;
                case 2:
                    createAccount("teacher");
                    break;
                case 3:
                    login("student");
                    break;
                case 4:
                    login("teacher");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void createAccount(String role) {
        try (FileWriter writer = new FileWriter(USER_FILE, true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a username: ");
            String username = scanner.nextLine();

            if (checkUsernameExists(username)) {
                System.out.println("Username already exists. Please choose a different username.");
            } else {
                System.out.print("Enter a password: ");
                String password = scanner.nextLine();

                writer.write(username + ":" + password + ":" + role + "\n");
                System.out.println("Account created successfully!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the account.");
        }
    }

    private static boolean checkUsernameExists(String username) {
        try (FileReader reader = new FileReader(USER_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                String existingUsername = parts[0];

                if (existingUsername.equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while checking username existence.");
        }

        return false;
    }

    private static void login(String role) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (validateLogin(username, password, role)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static boolean validateLogin(String username, String password, String role) {
        try (FileReader reader = new FileReader(USER_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                String existingUsername = parts[0];
                String existingPassword = parts[1];
                String existingRole = parts[2];

                if (existingUsername.equals(username) && existingPassword.equals(password) && existingRole.equals(role)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while validating the login.");
        }

        return false;
    }
}
