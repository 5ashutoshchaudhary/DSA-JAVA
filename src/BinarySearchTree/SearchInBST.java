package BinarySearchTree;
public class SearchInBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data = val;
        }
    }

    public static boolean isFound(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data<key){
            return isFound(root.right,key);
        }
        if(root.data>key){
            return isFound(root.left,key);
        }
        return false;
    }

    public static Node insert(Node root,int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data>val){
            root.left = insert(root.left,val);
        }
        if(root.data<val){
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i<values.length; i++){
           root = insert(root,values[i]);
        }
        System.out.println(isFound(root,0));
    }
}
