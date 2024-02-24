public class ContactManagement {

    Node head;

    public static class Node {
        int data;
        Node next;
        Node hungHung;
        Node (int d) {
            data  = d;
            next = null;
        }

        public int getNode() {
            return data;
        }

      //   public Node addNode() {
      //      return Node;
      //  }
    }


    public static void main(String[] args) {
        Node anode = new Node(10);
        Node nodeTwo = new Node(500);
        System.out.println(anode.getNode());
        System.out.println(nodeTwo.getNode());
        

    }
}
