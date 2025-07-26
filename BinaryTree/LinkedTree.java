
import java.util.Arrays;

class Node {

    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
        left = right = null;
    }
}

public class LinkedTree {

    Node root;
    int c = 0;
    char[] leaf = new char[10];

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            c++;
            inorder(node.right);
            for (int i = 0; i < leaf.length; i++) {
                if (node.left == null && node.right == null) {
                    leaf[i] = node.data;
                }
            }
        }
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        LinkedTree obj = new LinkedTree();
        obj.root = new Node('a');
        obj.root.left = new Node('b');
        obj.root.right = new Node('c');
        obj.root.left.left = new Node('d');
        obj.root.left.right = new Node('e');
        obj.root.left.left.right = new Node('g');

        obj.root.right.left = new Node('f');
        obj.root.left.right.left = new Node('h');
        obj.root.right.left.left = new Node('i');
        obj.root.right.left.right = new Node('j');

        System.out.print("Inorder :");
        obj.inorder(obj.root);
        System.out.println();
        System.out.println("inorder node counts:" + obj.c);
        System.out.println("leaf nodes in inorder:" + Arrays.toString(obj.leaf));
        System.out.print("preorder :");
        obj.preorder(obj.root);
        System.out.println();
        System.out.print("postorder :");
        obj.postorder(obj.root);
        System.out.println();

    }
}
