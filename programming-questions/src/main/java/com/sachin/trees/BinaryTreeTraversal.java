package com.sachin.trees;

import java.util.Arrays;

/**
 * Created by sbhosale on 1/2/14.
 */
public class BinaryTreeTraversal {

    public static void main(String[] args){

        Integer[] intArr = new Integer[]{16,5,2,4,8,9,7,33};

        MyBinaryTree<Integer> integerMyBinaryTree = new MyBinaryTree<Integer>(Arrays.asList(intArr));

        System.out.println("Printing InOrder");
        integerMyBinaryTree.printInOrder();
        System.out.println("Printing PostOrder");
        integerMyBinaryTree.printPostOrder();
        System.out.println("Printing Leaf Nodes");
        integerMyBinaryTree.printLeafNodes();
        integerMyBinaryTree.findDepthOfTree();
    }
}
