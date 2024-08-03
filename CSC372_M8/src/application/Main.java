package application;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static LinkedList studentList = new LinkedList();

    // Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for data until 'exit'
        while (true) {
            System.out.println("Enter student data (type 'exit' to quit):");

            // Name
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            // Address
            System.out.print("Address: ");
            String address = scanner.nextLine();

            double gpa = -1;
            // GPA 
            while (gpa < 0) {
                System.out.print("GPA: ");
                try {
                    gpa = Double.parseDouble(scanner.nextLine());
                    if (gpa < 0) {
                        System.out.println("GPA must be a positive number. Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid GPA. Enter a valid number.");
                }
            }

            // Create new student object
            Student student = new Student(name, address, gpa);
            studentList.add(student);

            // Display all students
            displayAllStudents();

            System.out.println("\nType 'exit' to quit or press Enter to continue.");
            if (scanner.nextLine().equalsIgnoreCase("exit")) {
                break;
            }
        }

        // Save to file
        saveToFile();

        scanner.close();
        System.out.println("Exiting program.");
    }

    // Display students in console method
    private static void displayAllStudents() {
        System.out.println("\nStudent List:");
        StudentNode current = studentList.getHead();
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Save to file method
    private static void saveToFile() {
        try (FileWriter writer = new FileWriter("students.txt")) {
            StudentNode current = studentList.getHead();
            while (current != null) { // Loop through LinkedList
                writer.write(current.data.toString() + "\n");
                current = current.next;
            }
            System.out.println("Data has been saved to students.txt.");
        } catch (IOException e) {
            System.out.println("Error saving to file.");
        }
    }
}


