import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    
    void insert(int data) {
        root = insertRec(root, data);
    }

    
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

   
    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    
    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.print(node.data + " ");
        }
    }

   
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }
}

public class BSTMenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Insert Node");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Inorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    bst.insert(value);
                    break;
                case 2:
                    System.out.println("Preorder Traversal:");
                    bst.preorder();
                    break;
                case 3:
                    System.out.println("Inorder Traversal:");
                    bst.inorder();
                    break;
                case 4:
                    System.out.println("Postorder Traversal:");
                    bst.postorder();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
