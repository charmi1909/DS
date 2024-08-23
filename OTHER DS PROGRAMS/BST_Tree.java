import javax.swing.tree.TreeNode;

public class BST_Tree {
    class Treenode{
    int val;
    Treenode left;
    Treenode right;

    Treenode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
Treenode root;

public BST_Tree(){
    root=null;
}
void insert(int data){
    root=insertRecord(root,data);
}

public Treenode insertRecord(Treenode root,int data){
if(root==null){
    root=new Treenode(data);
    return root; 
}   
if (data < root.val) {
    root.left = insertRecord(root.left, data);
} else if (data > root.val) {
    root.right = insertRecord(root.right, data);
}
return root;
}

void inorder() {
        inorderRec(root);
    }

    
    private void inorderRec(Treenode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }


public static void main(String []args){
    BST_Tree bst = new BST_Tree();

    bst.insert(40);
    bst.insert(30);
    bst.insert(50);
    bst.insert(10);
    bst.insert(79);

    System.out.println("Inorder traversal of the BST:");
    bst.inorder();
}
}

