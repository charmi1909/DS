import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    private int postIndex;
    private Map<Integer, Integer> postMap;

    
    public Node constructTree(int[] preorder, int[] postorder) {
        postIndex = postorder.length - 1;
        postMap = new HashMap<>();

        
        for (int i = 0; i < postorder.length; i++) {
            postMap.put(postorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1);
    }

    private Node buildTree(int[] preorder, int preStart, int preEnd) {
        if (preStart > preEnd || postIndex < 0) {
            return null;
        }

        
        Node root = new Node(preorder[preStart]);
        postIndex--;

       
        if (preStart == preEnd) {
            return root;
        }

        
        int postIndexNext = postMap.get(preorder[preStart + 1]);

        
        root.left = buildTree(preorder, preStart + 1, preStart + 1 + (postIndexNext - postIndex - 1));
        root.right = buildTree(preorder, preStart + 1 + (postIndexNext - postIndex - 1), preEnd);

        return root;
    }

    
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}

public class ConstructBinaryTree {
    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.constructTree(preorder, postorder);

        System.out.println("Inorder Traversal of the constructed tree:");
        tree.inorder(root); 
    }
}
