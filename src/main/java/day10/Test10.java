package day10;

public class Test10 {
    public static void main(String[] args) {
        Node root = new Node(20);

        Tree tree = new Tree();
        tree.addNode(root, 14);
        tree.addNode(root, 23);
        tree.addNode(root, 11);
        tree.addNode(root, 5);
        tree.addNode(root, 8);
        tree.addNode(root, 16);
        tree.addNode(root, 15);
        tree.addNode(root, 18);
        tree.addNode(root, 23);
        tree.addNode(root, 22);
        tree.addNode(root, 27);
        tree.addNode(root, 24);
        tree.addNode(root, 150);

        tree.preorderTraversal(root); //без сортировки
        System.out.println();
        Tree.traverseInOrder(root); //с сотрировкой
    }

}