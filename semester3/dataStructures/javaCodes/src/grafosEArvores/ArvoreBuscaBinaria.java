class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

class BinarySearchTree {

    Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);

        System.out.print("In-order: ");
        bst.inOrder(bst.root);       // saída: 1 3 6 8 10 14
        System.out.println();

        System.out.print("Pre-order: ");
        bst.preOrder(bst.root);      // saída: 8 3 1 6 10 14
        System.out.println();

        System.out.print("Post-order: ");
        bst.postOrder(bst.root);     // saída: 1 6 3 14 10 8
        System.out.println();
    }
}
