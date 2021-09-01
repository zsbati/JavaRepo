public class BinaryTree {
    Node root;

    private Node addRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = addRecursive(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = addRecursive(currentNode.right, value);
        } else {
            // value already exists
            return currentNode;
        }

        return currentNode;
    }

    public void add(int value) { //start the iteration
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (value == currentNode.value) {
            return true;
        }
        return value < currentNode.value
                ? containsNodeRecursive(currentNode.left, value)
                : containsNodeRecursive(currentNode.right, value);
    }

    public  boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }



}
