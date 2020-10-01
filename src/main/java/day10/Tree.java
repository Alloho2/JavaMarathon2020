package day10;

public class Tree {

    public Node addNode(Node current, int val) {
        if (current == null) {
            return new Node(val);
        }
        if (val < current.val) {
            current.left = addNode(current.left, val);
        } else if (val > current.val) {
            current.right = addNode(current.right, val);
        } else {
            return current;
        }
        return current;
    }

    public void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(root.val + " ");
            traverseInOrder(root.right);
        }
    }
}

