class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}
class BST{
    Node root;
    public BST(){
        root = null;
    }
    public void insert(int data){
        Node node = new Node(data);
        if(root==null){
            root = node;
        }
        else{
            Node curr = root;
            while (true){
                if(node.data<curr.data){

                    if(curr.left == null){
                        curr.left = node;
                        break;
                    }
                    curr= curr.left;
                } else { // ( node.data > curr.data ) Condition for Right Sub Tree

                    if(curr.right == null){
                        curr.right = node;
                        break;
                    }
                    curr= curr.right;

                }
            }
        }
    }

    public void inOrder(Node Root){
        if (Root != null){
            inOrder(Root.left);
            System.out.print(Root.data + " ");
            inOrder(Root.right);
        }
    }

    public void preOrder(Node Root){
        if (Root != null){
            System.out.print(Root.data + " ");
            preOrder(Root.left);
            preOrder(Root.right);
        }
    }


    public void postOrder(Node Root){
        if (Root != null){
            postOrder(Root.left);
            postOrder(Root.right);
            System.out.print(Root.data + " ");
        }
    }

    public boolean isBST(Node root){

        Node prev = null; // Checking Children Node

        if(root!=null){

            if(!isBST(root.left)){
                return false;
            }
            if (prev!=null && root.data <= prev.data){
                return false;
            }
            prev = root;
            return isBST(root.right);
        }
        else{
            return true;
        }
    }

    public void searchIterative(Node root, int key){


        while(root != null){

            if(root.data == key){
                System.out.println("Value Found: " + root.data);
                return;
            }
            else if (key < root.data)
            {
                root = root.left;
            }
            else
            {
                root = root.right;
            }

        }
        System.out.println("Value Not Found");
    }

  public Node inOrderPredecessor(Node root){
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return root;

  }
    public Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        }

        // Search for the node to be deleted
        if (value < root.data)
        {
            root.left = deleteNode(root.left, value);
        }
        else if (value > root.data)
        {
            root.right = deleteNode(root.right, value);
        }
        else
        {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder predecessor // Largest value in sub tree
            Node iPre = inOrderPredecessor(root);
            root.data = iPre.data;

            // Delete the inorder predecessor
            root.left = deleteNode(root.left, iPre.data);
        }
        return root;
    }



}

public class Main {
    public static void main(String[] args) {

        BST obj = new BST();
        obj.insert(21);
        obj.insert(10);
        obj.insert(5);
        obj.insert(15);
        obj.insert(3);
        obj.insert(12);
        obj.insert(30);
        obj.insert(25);
        obj.insert(35);
        obj.insert(32);
        obj.insert(37);


        obj.inOrder(obj.root );
        System.out.println("InOrder BST");

        obj.preOrder(obj.root);
        System.out.println("PreOrder BST");

        obj.postOrder(obj.root);
        System.out.println("PostOrder BST");

        if(obj.isBST(obj.root)){
            System.out.println("Yes this is a Binary Tree");
        }
        else{
            System.out.println("No this is not a Binary Tree");
        }


        obj.searchIterative(obj.root , 3);


        obj.root = obj.deleteNode(obj.root, 21);

        obj.inOrder(obj.root );
        System.out.println("InOrder BST");





    }
}