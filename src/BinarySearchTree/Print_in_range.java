package BinarySearchTree;

public class Print_in_range {
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int val){
            this.data = val;
        }
    }
    
    public static Node insert(Node root,int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data>val){
            root.left = insert(root.left,val);
        }
        if(root.data<val) root.right = insert(root.right,val);
        return root;
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root == null) return;

        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data + " ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data < k1){
            printInRange(root.right,k1,k2);
        }
        else{
            printInRange(root.left,k1,k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root,values[i]);
        }
        printInRange(root,1,2);
    }
}
