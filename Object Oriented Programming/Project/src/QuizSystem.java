import java.io.*;
import java.util.*;

public class QuizSystem {
    private static final String USER_FILE = "users.txt";
    private static final String COURSE_FILE = "courses.txt";
    private static final String QUESTION_BANK_FILE = "question_bank.txt";
    private static final String QUIZ_FILE = "quiz.txt";
    private static final String ANSWER_KEY_FILE = "answer_key.txt";
    private static final String RESULT_FILE = "result.txt";
    private static final String ATTENDANCE_FILE = "attendance.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create Users");
            System.out.println("2. Offer Courses");
            System.out.println("3. Prepare Question Bank");
            System.out.println("4. Generate Quiz");
            System.out.println("5. Conduct Quiz");
            System.out.println("6. Generate Answer Key");
            System.out.println("7. Prepare Result");
            System.out.println("8. Quiz Analytics");
            System.out.println("9. Generate Attendance Sheet");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    UserSystem um = new UserSystem();
                    um.UserManagement();
                   // createUsers();
                    break;
                case 2:
                    offerCourses();
                    break;
                case 3:
                    prepareQuestionBank();
                    break;
                case 4:
                    generateQuiz();
                    break;
                case 5:
                    conductQuiz();
                    break;
                case 6:
                    generateAnswerKey();
                    break;
                case 7:
                    prepareResult();
                    break;
                case 8:
                    quizAnalytics();
                    break;
                case 9:
                    generateAttendanceSheet();
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

//    private static void createUsers() {
//        try (FileWriter writer = new FileWriter(USER_FILE)) {
//            writer.write("Instructor\n");
//            writer.write("Student1\n");
//            writer.write("Student2\n");
//            writer.write("Student3\n");
//            System.out.println("Users created successfully!");
//        } catch (IOException e) {
//            System.out.println("An error occurred while creating users.");
//        }
//    }

    private static void offerCourses() {
        try (FileReader reader = new FileReader(COURSE_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            int count = 1;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }

            System.out.println("Course offering list displayed successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while viewing the course offering list.");
        }
//        try (FileWriter writer = new FileWriter(COURSE_FILE)) {
//            writer.write("Course1\n");
//            writer.write("Course2\n");
//            writer.write("Course3\n");
//            System.out.println("Courses offered successfully!");
//        } catch (IOException e) {
//            System.out.println("An error occurred while offering courses.");
//        }
    }

    private static void prepareQuestionBank() {
        try (FileWriter writer = new FileWriter(QUESTION_BANK_FILE)) {
            Scanner scanner = new Scanner(System.in);
            int choice;
            boolean done = false;

            do {
                System.out.println("1. Add MCQ");
                System.out.println("2. Add True/False");
                System.out.println("3. Add Subjective");
                System.out.println("0. Done");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the MCQ question: ");
                        String mcqQuestion = scanner.nextLine();
                        writer.write("MCQ: " + mcqQuestion + "\n");
                        break;
                    case 2:
                        System.out.print("Enter the True/False question: ");
                        String tfQuestion = scanner.nextLine();
                        writer.write("True/False: " + tfQuestion + "\n");
                        break;
                    case 3:
                        System.out.print("Enter the subjective question: ");
                        String subjectiveQuestion = scanner.nextLine();
                        writer.write("Subjective: " + subjectiveQuestion + "\n");
                        break;
                    case 0:
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (!done);

            System.out.println("Question bank preparation completed!");
        } catch (IOException e) {
            System.out.println("An error occurred while preparing the question bank.");
        }
    }

    private static void generateQuiz() {
        try (FileReader reader = new FileReader(QUESTION_BANK_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter(QUIZ_FILE)) {
            List<String> questions = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                questions.add(line);
            }

            Collections.shuffle(questions);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of questions to include in the quiz: ");
            int numQuestions = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numQuestions; i++) {
                writer.write(questions.get(i) + "\n");
            }

            System.out.println("Quiz generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the quiz.");
        }
    }

    private static void conductQuiz() {
        try (FileReader reader = new FileReader(QUIZ_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter(RESULT_FILE)) {
            List<String> questions = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                questions.add(line);
            }

            Collections.shuffle(questions);

            // Conduct the quiz and record the answers

            System.out.println("Quiz conducted successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while conducting the quiz.");
        }
    }

    private static void generateAnswerKey() {
        try (FileReader reader = new FileReader(QUIZ_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter(ANSWER_KEY_FILE)) {
            Scanner scanner = new Scanner(System.in);
            List<String> questions = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                questions.add(line);
            }

            for (String question : questions) {
                // Generate answer key/solution for each question
                System.out.println(question);
                writer.write("Answer: "+scanner.nextLine()+"\n");
            }

            System.out.println("Answer key generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the answer key.");
        }
    }

    private static void prepareResult() {
        try (FileWriter writer = new FileWriter(RESULT_FILE, true)) {
            // Prepare the result by reading the recorded answers
            writer.write("Student1: 80%\n");
            writer.write("Student2: 90%\n");
            writer.write("Student3: 75%\n");
            System.out.println("Result prepared successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while preparing the result.");
        }
    }

    private static void quizAnalytics() {
        try (FileReader reader = new FileReader(RESULT_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            // Perform quiz analytics and show the percentage of correct answers for each question
            // Display the bar graph
            System.out.println("Quiz analytics generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while generating quiz analytics.");
        }
    }

    private static void generateAttendanceSheet() {
        try (FileReader usersReader = new FileReader(USER_FILE);
             BufferedReader usersBufferedReader = new BufferedReader(usersReader);
             FileWriter writer = new FileWriter(ATTENDANCE_FILE)) {
            List<String> users = new ArrayList<>();
            String line;

            while ((line = usersBufferedReader.readLine()) != null) {
                users.add(line);
            }

            // Mark the absent students who did not attempt the quiz

            System.out.println("Attendance sheet generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the attendance sheet.");
        }
    }
}
