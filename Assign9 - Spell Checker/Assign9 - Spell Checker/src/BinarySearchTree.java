

public class BinarySearchTree <E extends Comparable<E>> {


    private static class Tree<E> {
        public E value;
        Tree<E> left;
        Tree<E> right;

        public Tree(E value) {
            this.value = value;
        }

    }

    private Tree<E> root;
    protected int size = 0;




    public void display(String message) {
        System.out.println(message);
        display(root);
    }

    public boolean remove(E value) {

        Tree<E> parent = null;
        Tree<E> node = root;
        boolean done = false;
        while (!done && node != null) {
            if (value.compareTo(node.value) > 0) {
                parent = node;
                node = node.right;
            } else if (value.compareTo(node.value) < 0) {
                parent = node;
                node = node.left;
            } else {
                done = true;
            }
        }
        // case for no left child
        if (node != null && node.left == null) {
            if (parent == null) {
                root = node.right;
            } else {
                if (value.compareTo(parent.value) > 0) {
                    parent.right = node.right;

                } else {
                    parent.left = node.right;
                }
            }
            size--;
        } else if (node != null && node.left != null) { // Case for left child
            Tree<E> parentOfRight = node;
            Tree<E> rightMost = node.left;
            while (rightMost.right != null) {
                parentOfRight = rightMost;
                rightMost = rightMost.right;
            }
            node.value = rightMost.value;
            if (parentOfRight.right == rightMost) {
                parentOfRight.right = rightMost.left;
            } else {
                parentOfRight.left = rightMost.left;
            }
            size--;

        }

        return true;
    }

    private boolean display(Tree<E> node) {
        if (node == null) {return false;}
        else {
            display(node.left);
            System.out.println(node.value);
            display(node.right);

        }

        return true;
    }

    public boolean insert(E value) {
        if (root == null) {
            root = new Tree<>(value);
        } else {
            Tree<E> parent = null;
            Tree<E> node = root;
            while (node != null) {
                parent = node;
                if (value.compareTo(node.value) > 0) {
                    node = node.right;
                } else if (value.compareTo(node.value) < 0){
                    node = node.left;
                } else {
                    return false;
                }
            }
            Tree<E> newNode = new Tree<>(value);
            if (value.compareTo(parent.value) > 0) {
                parent.right = newNode;
            } else {
                parent.left = newNode;
            }
        }
        size++;
        return true;
    }

    public boolean search(E value) {
        boolean found = false;
        Tree<E> node = root;
        while (!found && node != null) {
            if (node.value == value) {
                found = true;
            } else if (value.compareTo(node.value) > 0) {
                node = node.right;
            } else if (value.compareTo(node.value) < 0) {
                node = node.left;
            }
        }
        return found;
    }

    public int numberNodes() {
        return size;

    }

    public int numberLeafNodes() {
        return numberLeafNodes(root);
    }
    private int numberLeafNodes(Tree <E> root)
    {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        else
            return numberLeafNodes(root.left) + numberLeafNodes(root.right);
    }


    public int height() {

        return height(root) - 1;
    }
    private int height(Tree <E> root) {
        if (root == null) {
            return 0;
        }
        int lefth = height(root.left);
        int righth = height(root.right);

        if (lefth > righth) {
            return lefth + 1;
        } else {
            return righth + 1;
        }
    }


}
