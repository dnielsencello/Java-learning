public class StaticQueue<E> {
    private E[] data;
    private int front;
    private int back;
    private int count;

    public StaticQueue(int size) {
        this.data = (E[])(new Object[size]);
        this.front = 0;
        this.back = 0;
        this.count = 0;

    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull(){
        return count == data.length;
    }

    public void enqueue(E v) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        if (back == (data.length-1)) {
            back = 0;
        }else {
            back++;
        }
        data[back] = v;
        count++;
    }

    public E dequeue() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        E result = data[front];
        if (front == (data.length-1)){
            front = 0;
        } else {
            front++;
        }
        count--;
        return result;
    }
}
