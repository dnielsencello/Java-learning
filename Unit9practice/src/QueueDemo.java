public class QueueDemo {
    public static void main(String[] args) {
        StaticQueue<Integer> myQueue = new StaticQueue<>(4);

        try {
            myQueue.enqueue(1);
            myQueue.enqueue(2);
            myQueue.enqueue(3);
            myQueue.enqueue(4);
//            System.out.println(myQueue.dequeue());
//            System.out.println(myQueue.dequeue());
//            myQueue.enqueue(5);
//            myQueue.enqueue(6);
            while (!myQueue.isEmpty()){
                System.out.println(myQueue.dequeue());
            }

        }
        catch (Exception ex) {
            System.out.printf("Exception: %s\n  ", ex.getMessage());
        }
    }

}
