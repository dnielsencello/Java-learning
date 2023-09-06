public class LinkedList <E extends Comparable> {
    private ListNode<E> head = new ListNode<>();
    private int size;

    public LinkedList() {this.size = 0;}
    public int getSize() {return this.size;}
    public boolean isEmpty() {return this.size == 0;}

    public void insert(E o) {
        ListNode<E> node = new ListNode<>(o);
        ListNode<E> current = head.next;
        ListNode<E> previous = head;

        while (current != null && current.value.compareTo(o) < 0) {
            previous = current;
            current = current.next;

        }

        previous.next = node;
        node.next = current;
        this.size ++;

    }

    public void display() {
        ListNode<E> current = head.next;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;

        }

    }
    public boolean find(E o) {
        ListNode<E> current = head.next;
        boolean found = false;
        while (current != null && !found){
            if (current.value.compareTo(o) == 0) {
                found = true;
            } else {
                current = current.next;
            }


        }
        return found;
    }

    public void  remove(E o){
        ListNode<E> node  = head.next;
        ListNode<E> previous = head;

        while (node.value.compareTo(o) != 0) {
            previous = node;
            node = node.next;
        }

        previous.next = node.next;
        this.size--;

    }

    private class ListNode<E> {
        public E value;
        public ListNode<E> next;

        public ListNode() {}
        public ListNode(E o) {
            this.value = o;

        }
    }
}
