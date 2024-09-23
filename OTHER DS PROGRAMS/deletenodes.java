class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

   
    public void deleteAlternateNodes() {
        if (head == null) return;

        Node current = head;
        int count = 0;

        while (current != null) {
            
            if (count % 2 != 0) {
                Node temp = current;
                
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                current = current.next; 
                temp = null; 
                current = current.next; 
            }
            count++;
        }
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.println("Original Doubly Linked List:");
        list.printList();

        list.deleteAlternateNodes();

        System.out.println("Doubly Linked List after deleting alternate nodes:");
        list.printList();
    }
}
