package BinarySearchTree;

public class delete {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node FindInorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    static Node Delete(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.data < val){
            root.right = Delete(root.right,val);
        } else if(root.data > val){
            root.left = Delete(root.left,val);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }

            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                Node IS = FindInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = Delete(root.right,IS.data);
            }
        }
        return root;
    }

    static void PrintInRange(Node root,int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            PrintInRange(root.left,k1,k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right,k1,k2);
        }else if(root.data<k1){
            PrintInRange(root.right,k1,k2);
        }else{
            PrintInRange(root.left,k1,k2);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);

        root.left.left = new Node(2);
        root.left.right = new Node(6);

        root.right.left = new Node(10);
        root.right.right = new Node(14);
        System.out.println();
        PrintInRange(root,2,10);
    }
}
