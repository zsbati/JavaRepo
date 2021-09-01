public class Tests {

    BinaryTree bt;
    public Tests(BinaryTree bt) {
        this.bt = bt;
    }

    public static boolean find(boolean statement) {
        if (statement == true){
            return true;
        } else {
            return false;
        }
    }

    public static void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements(BinaryTree bt) {


        System.out.println(find(bt.containsNode(6)));
        System.out.println(find(bt.containsNode(4)));

        System.out.println(find(bt.containsNode(1)));

    }


}
