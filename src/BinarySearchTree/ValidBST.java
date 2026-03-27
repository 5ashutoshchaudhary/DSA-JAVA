package BinarySearchTree;
public class ValidBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isValid(Node root ,Integer min , Integer max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min){
            return false;
        }else if(max != null && root.data >= max){
            return false;
        }
        return isValid(root.left,min,root.data)
                && isValid(root.right,root.data,max);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);

        root.left.left = new Node(2);
        root.left.right = new Node(6);

        root.right.left = new Node(10);
        root.right.right = new Node(14);

        boolean result = isValid(root,null,null);
        System.out.println(result);
    }
}
