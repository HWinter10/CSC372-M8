package application;
// This class represents an individual student and the data associated with them.
// It encapsulates the information in a structured way. 
public class Student {
    private String name;
    private String address;
    private double gpa;

    // Initialize student data
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    // Getters for student's data
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", GPA: " + gpa;
    }
}

