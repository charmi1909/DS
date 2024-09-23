class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Make it circular
        }
    }

   
    public void split() {
        if (head == null) return;

        Node slow = head;
        Node fast = head;

        
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        Node head1 = head;
        Node head2 = slow.next;
        slow.next = head1; 
        fast.next = head2; 
       
        System.out.println("First half:");
        printList(head1);
        System.out.println("Second half:");
        printList(head2);
    }

    
    private void printList(Node start) {
        if (start == null) return;

        Node current = start;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != start);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.println("Circular Linked List:");
        list.printList(list.head);

        list.split();
    }
}
