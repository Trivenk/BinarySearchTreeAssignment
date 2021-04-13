package main;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree<Integer> mt = new MyBinarySearchTree<>();
        mt.insert(5);
        mt.insert(2);
        mt.insert(8);
        mt.insert(1);
        mt.insert(4);
        mt.insert(11);
        mt.insert(3);
        mt.inOrder(mt.getRoot());
        System.out.println();
        System.out.println(mt.search(15));
        System.out.println(mt.height(mt.getRoot()));
    }
}
