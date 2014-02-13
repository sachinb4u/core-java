package com.sachin.trees;

import java.util.Collection;

/**
 * Created by sbhosale on 1/2/14.
 */
public class MyBinaryTree<T  extends Comparable<T>> {
    Node<T> root;
    int size = 0;

    MyBinaryTree(){
        root = null;
        size = 0;
    }

    MyBinaryTree(T element){
        Node<T> node1 = new Node<T>(null, element, null);
        root = node1;
        size++;
    }

    MyBinaryTree(Collection<? extends T> collection){
        if(collection == null || collection.isEmpty()){
            return;
        }

        for(T element : collection){
            root = insert(root, element);
        }

    }

    public void insertElement(T data){
        root = insert(root, data);
    }


    public void findDepthOfTree(){
        int depth = findDepth(root);
        System.out.println("Depth of Tree = " + depth);
    }

    private int findDepth(Node<T> node){

        if(node == null ){
            return 0;
        }

        return 1 + Math.max(findDepth(node.left), findDepth(node.right));
    }

    private Node<T> insert(Node<T> node, T data){
        if(node == null){
            node= new Node<T>(null, data, null);
        }

        if(data.compareTo(node.data) == -1){
             node.left= insert(node.left, data);
        }else if(data.compareTo(node.data) == 1){
            node.right = insert(node.right, data);
        }
        return  node;
    }

    public void printPostOrder(){
        postOrder(root);
    }

    public void printInOrder(){
        inOrder(root);
    }
    private void inOrder(Node<T> node){
        if(node == null){
            return;
        }

        if(node.left!= null){
            inOrder(node.left);
        }
        System.out.println("( " + node.data + " )");
        if(node.right != null){
            inOrder(node.right);
        }
    }

    private void postOrder(Node<T> node){
        if(node == null){
            return;
        }


        if(node.right != null){
            inOrder(node.right);
        }
        System.out.println("( " + node.data + " )");
        if(node.left!= null){
            inOrder(node.left);
        }


    }

    public void printLeafNodes(){

        printLeafNode(root);
    }

    private void printLeafNode(Node<T> node){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            System.out.println("Leaf ( " + node.data + " )");
        }

        printLeafNode(node.left);
        printLeafNode(node.right);
    }

    private static class Node<T>{
        T data;
        Node<T> left;
        Node<T> right;

        Node(Node<T> left1, T data1, Node<T> right1){
            this.left = left1;
            this.data = data1;
            this.right = right1;
        }
    }
}
