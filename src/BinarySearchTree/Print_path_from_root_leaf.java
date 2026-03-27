package BinarySearchTree;
import java.util.*;
public class Print_path_from_root_leaf {
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
        if(root.data<val){
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void print(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            if(i == path.size() - 1){
                System.out.print(path.get(i));
            } else {
                System.out.print(path.get(i) + "->");
            }
        }
        System.out.println();
    }

    public static void printPath(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            print(path);
        }
        printPath(root.left,path);
        printPath(root.right,path);
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root,values[i]);
        }
        ArrayList<Integer> path = new ArrayList<>();
        printPath(root,path);
    }
}
