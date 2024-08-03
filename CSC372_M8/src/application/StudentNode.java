package application;
// This class represents a single node in the LinkedList class.
// Each StudentNode contains a Student object and a reference to the next node. 
// It is essentially building a block of the LinkedList. 
class StudentNode {
    Student data;
    StudentNode next;
    // Initialize node
    public StudentNode(Student data) {
        this.data = data;
        this.next = null;
    }
}

