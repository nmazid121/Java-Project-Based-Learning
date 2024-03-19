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

        // converts the hashcodes of the references in the heap into the actual head.next value that its pointing to
        // this is for the pointers when we ever use a .next
        @Override
        public String toString() {
        return String.valueOf(data);
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

    public void addNode(int data) {
        Node newNode = new Node(data);
        
    }

   
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    
    // outputs the linked list using a StringBuilder and appends the pointer and the Node value
    // once the currentNode reaches null, it will output null as the last element points to null
     @Override
        public String toString() {
            StringBuilder listRepresentation = new StringBuilder();
            Node currentNode = head;
            while (currentNode != null) {
                listRepresentation.append(currentNode.getNode()).append(" -> ");
                currentNode = currentNode.next;
            }
            listRepresentation.append("null");
            return listRepresentation.toString();
        }   
    


    public static void main(String[] args) {
        
        // these access the Node class itself
        Node head = new Node(0);
        Node firstNode = new Node(10);
        Node secondNode = new Node(5);



        // this accesses the ContactManagement class which uses the Node class implementation we made earlier
        ContactManagement headContactM = new ContactManagement();
        headContactM.addFirst(5);
        headContactM.addFirst(10);
        headContactM.addLast(20);
        headContactM.addFirst(500);
        headContactM.addLast(50);
        System.out.println(headContactM);

        System.out.println("Is the list empty?");
        if (headContactM.isEmpty() == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }
}
