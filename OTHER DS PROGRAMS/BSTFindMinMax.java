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

    
    int findMin() {
        return findMinRec(root);
    }

    
    int findMinRec(Node node) {
        if (node.left == null) {
            return node.data;
        }
        return findMinRec(node.left);
    }

    
    int findMax() {
        return findMaxRec(root);
    }

   
    int findMaxRec(Node node) {
        if (node.right == null) {
            return node.data;
        }
        return findMaxRec(node.right);
    }
}

public class BSTFindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        
        System.out.println("Enter numbers to insert into the BST (enter -1 to stop):");
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) break;
            bst.insert(value);
        }

        System.out.println("Smallest element in the BST: " + bst.findMin());
        System.out.println("Largest element in the BST: " + bst.findMax());

        scanner.close();
    }
}
