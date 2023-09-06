import java.util.Objects;

public class StaticStack<E> {
    public E[] data;
    public int top = -1;

    public StaticStack(int maxSize){
        this.data = (E[]) new Object[maxSize];


    }

    public void push(E v) throws Exception{
        if (isFull()) {
            throw new Exception("Stack is Full");
        }

        top ++;
        data[top] = v;
    }

    public E pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return data[top--];
    }

    public boolean isFull() {
        return this.top == this.data.length - 1;

    }
    public boolean isEmpty() {
        return top == -1;
    }
}
