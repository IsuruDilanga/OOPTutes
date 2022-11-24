package Question8;

import java.util.ArrayList;

public class Queue<T> {

    private int maxSize;
    private ArrayList<T> queue = new ArrayList<>();

    public Queue(int size){
        maxSize = size;
    }

    public void enQueue(T value){
        if (queue.size() < maxSize) {
            queue.add(value);
        }
    }

    public T deQueue(){
        if (queue.size() > 0){
            return  queue.remove(0);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "maxSize=" + maxSize +
                ", queue=" + queue +
                '}';
    }
}
