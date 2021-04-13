package myinterface;

public interface Node<E extends Comparable<E>> {
    //marker interface
    public E getData();
    public void setData(E data);
    public Node<E> getLeft();
    public Node<E> getRight();
    public void setLeft(Node<E> left);
    public void setRight(Node<E> right);
}
