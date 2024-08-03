package application;
// This class manages the StudentNodes allowing the program to add nodes
// A return head method is also included in order to travers the data, 
// thus allowing it to be read

public class LinkedList {
	// Head of LinkedList
    private StudentNode head;
   // Add new student method
    public void add(Student data) {
        StudentNode newElement = new StudentNode(data);
        if (head == null) {
            head = newElement;
        } else {
        	// Initialize pointers for traversing list
            StudentNode current = head;
            StudentNode previous = null;
            // Traverse list 
            while (current != null && current.data.getName().compareTo(data.getName()) < 0) {
                previous = current;
                current = current.next;
            }
            // Insert new node @ beginning of list
            if (previous == null) {
                newElement.next = head;
                head = newElement;
            // Insert new node between previous & current
            } else { 
                previous.next = newElement;
                newElement.next = current;
            }
        }
    }
    // Return head method
    public StudentNode getHead() {
        return head;
    }
}

