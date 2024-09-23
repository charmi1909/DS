class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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
    }

    
    private Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node mergedHead;
        if (left.data < right.data) {
            mergedHead = left;
            mergedHead.next = merge(left.next, right);
        } else {
            mergedHead = right;
            mergedHead.next = merge(left, right.next);
        }
        return mergedHead;
    }

    
    private Node[] split(Node head) {
        if (head == null || head.next == null) {
            return new Node[] {head, null};
        }

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next = null; 
        return new Node[] {head, secondHalf};
    }

    
    public void mergeSort() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node[] halves = split(head);
        Node left = mergeSort(halves[0]);
        Node right = mergeSort(halves[1]);

        return merge(left, right);
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
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(9);
        list.insert(1);
        list.insert(6);

        System.out.println("Original Linked List:");
        list.printList();

        list.mergeSort();

        System.out.println("Sorted Linked List:");
        list.printList();
    }
}
