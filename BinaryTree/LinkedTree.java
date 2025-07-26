
import java.util.*;

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
    int c = 0, leafIndex = 0;
    char[] leaf;

    public LinkedTree(int size) {

        leaf = new char[size];
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            c++;
            if (node.left == null && node.right == null && leafIndex < leaf.length) {
                leaf[leafIndex++] = node.data;
            }
            inorder(node.right);
        }
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
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

        LinkedTree obj = new LinkedTree(10);

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

        System.out.print("Inorder : ");
        obj.inorder(obj.root);
        System.out.println();
        System.out.println("Inorder node count: " + obj.c);
        System.out.println("Leaf nodes in inorder: " + Arrays.toString(Arrays.copyOf(obj.leaf, obj.leafIndex)));

        System.out.print("Preorder : ");
        obj.preorder(obj.root);
        System.out.println();

        System.out.print("Postorder : ");
        obj.postorder(obj.root);
        System.out.println();

        System.out.println("Height: " + obj.height(obj.root));
    }
}
