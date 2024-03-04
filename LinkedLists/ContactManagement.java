import java.io.NotActiveException;

public class ContactManagement {

    // creating the class for the Nodes 
    public static class Node {
        int data;
        Node next;
        
        Node (int d) {
            data  = d;
            next = null;
        }

        public int getNode() {
            return data;
        }
    }
 
    Node head;

    // constructor for the ContactManagement classs
    public ContactManagement() {
        this.head = null; // Initializing the head to null
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

   
   
   
    public void addLast(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    


    public static void main(String[] args) {
        Node johnNode = new Node(5);
        System.out.println(johnNode.getNode());
        johnNode.addFirst(5);

    }
}
