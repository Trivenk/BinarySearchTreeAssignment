package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    //complete node class
    private E data;
    private Node<E> left,right;
    public Node(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


    @Override
    public E getData() {
        return data;
    }

    @Override
    public void setData(E data) {
        this.data = data;
    }

    @Override
    public myInterface.Node<E> getLeft() {
        return left;
    }

    @Override
    public myInterface.Node<E> getRight() {
        return right;
    }

    @Override
    public void setLeft(myInterface.Node<E> left) {
        this.left = (Node<E>)left;
    }

    @Override
    public void setRight(myInterface.Node<E> right) {
        this.right = (Node<E>) right;
    }
}
