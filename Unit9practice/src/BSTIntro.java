public class BSTIntro {
    public static void main(String[] args) {
        BinarySearchTree<Integer> myTree = new BinarySearchTree<>();

        myTree.insert(20);
        myTree.insert(2);
        myTree.insert(100);
        myTree.insert(18);
        myTree.insert(64);
        myTree.insert(42);
//        if (myTree.search(42)) {
//            System.out.println("Did find the answer");
//        } else{
//            System.out.println("Did not find the answer");
//        }
        System.out.println("--- Before ---");

        myTree.displayInOrder();
        myTree.remove(64);
        System.out.println("--- After ---");
        myTree.displayInOrder();
    }
}
