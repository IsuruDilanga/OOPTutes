package Question9;

class Node<T> {

    private T element;
    private Node<T> next;

    public T getValue(){
        return element;
    }

    public void setValue(T value){
        this.element = value;
    }

    public Node<T> getNextRef(){
        return next;
    }

    public void setNextRef(Node<T> ref){
        this.next = ref;
    }
}
