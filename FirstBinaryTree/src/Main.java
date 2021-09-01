public class Main {
    public static BinaryTree bt = new BinaryTree();

    public static void main(String[] args) {

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

     Tests.givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements(bt);

    }

}
