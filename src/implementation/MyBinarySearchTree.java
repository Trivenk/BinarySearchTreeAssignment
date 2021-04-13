package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private implementation.Node<E> root;

    public implementation.Node<E> getRoot() {
        return root;
    }

    @Override
    public void insert(E data) {
        implementation.Node<E> node = new implementation.Node<>(data);
        if(root==null)
        {
            root = node;
            return;
        }
        implementation.Node prev = null;
        implementation.Node temp = root;
        while(temp!=null)
        {
            prev = temp;
            if(data.compareTo((E) temp.getData())<=0)
            {
                temp = (implementation.Node<E>) temp.getLeft();
            }
            else{
                temp = (implementation.Node<E>) temp.getRight();
            }
        }
        if(data.compareTo((E) prev.getData())<=0)
            prev.setLeft(node);
        else
            prev.setRight(node);

    }

    @Override
    public boolean search(E searchElement) {
        if(root==null)
            return false;
        implementation.Node temp = root;
        while(temp!=null)
        {
            if(searchElement.compareTo((E)temp.getData())==0)
                return true;
            else if(searchElement.compareTo((E)temp.getData())<0)
                temp = (implementation.Node<E>) temp.getLeft();
            else
                temp = (implementation.Node<E>) temp.getRight();

        }
        return false;

    }

    @Override
    public void inOrder(Node<E> node) {
        if(node==null)
            return;
        inOrder(node.getLeft());
        System.out.print(node.getData()+" ");
        inOrder(node.getRight());
    }

    @Override
    public void preOrder(Node<E> node) {
        if(node==null)
            return;
        System.out.print(node.getData()+" ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    @Override
    public void postOrder(Node<E> node) {
        if(node==null)
            return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getData()+" ");
    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        if(node==null)
            return -1;
        return 1+Math.max(height(node.getLeft()),height(node.getRight()));
    }
}
