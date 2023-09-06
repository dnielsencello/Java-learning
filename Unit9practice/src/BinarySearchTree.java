public class BinarySearchTree <E extends Comparable<E>> {
    private static class TreeNode <E> {
        public E value;
        TreeNode <E> left;
        TreeNode <E> right;

        public TreeNode(E value){
            this.value = value;
        }

    }

    private TreeNode <E> root;

    public void displayInOrder() {
        displayInOrder(root);
    }

    public void remove(E value) {

        TreeNode <E> parent =null;
        TreeNode <E> node = root;
        boolean done = false;
        while (!done) {
            if(value.compareTo(node.value) > 0) {
                parent = node;
                node = node.right;

            } else if (value.compareTo(node.value) < 0){
                parent = node;
                node = node.left;
            } else {
                done = true;
            }
        }
        // case for no left child
        if (node.left == null) {
            if (parent == null) {
                root = node.right;
            } else {
                if (value.compareTo(parent.value) > 0) {
                    parent.right = node.right;

                } else {
                    parent.left = node.right;
                }
            }
        }else { // Case for left child
            TreeNode <E> parentOfRight = node;
            TreeNode <E> rightMost = node.left;
            while (rightMost.right !=null) {
                parentOfRight = rightMost;
                rightMost = rightMost.right;
            }
            node.value = rightMost.value;
            if(parentOfRight.right == rightMost) {
                parentOfRight.right = rightMost.left;
            } else {
                parentOfRight.left = rightMost.left;
            }
        }
    }
    private void displayInOrder(TreeNode <E> node) {
        if (node == null) return;
        displayInOrder(node.left);
        System.out.println(node.value);
        displayInOrder(node.right);

    }
    public void insert(E value){
        if (root == null) {
            root = new TreeNode <E>(value);
        } else {
            TreeNode <E> parent = null;
            TreeNode <E> node = root;
            while (node != null) {
                parent = node;
                if (value.compareTo(node.value) > 0) {
                    node = node.right;
                } else {
                    node = node.left;
                }
            }
            TreeNode<E> newNode = new TreeNode<>(value);
            if (value.compareTo(parent.value) > 0) {
                parent.right = newNode;
            } else {
                parent.left = newNode;
            }
        }
    }
    public boolean search(E value) {
        boolean found = false;
        TreeNode<E> node = root;
        while (!found && node != null){
            if (node.value == value) {
                found = true;
            }else if (value.compareTo(node.value) > 0) {
                node = node.right;
            } else if (value.compareTo(node.value) < 0) {
                node = node.left;
            }
        }
        return found;
    }
}
