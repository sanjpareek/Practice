package com.example.BST;

/**
 * Created by sanjana on 17/7/17.
 */
public class BSTNode {
    public BSTNode left;
    public BSTNode right;
    public int data;

    public BSTNode(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }

    public BSTNode(){
        this.left = null;
        this.right = null;
        this.data = 0;
    }
}
