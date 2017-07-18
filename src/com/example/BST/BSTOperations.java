package com.example.BST;

/**
 * Created by sanjana on 17/7/17.
 *
 * insert, delete, count nodes, search, inorder, preorder, postorder, isBST
 */
public class BSTOperations {
    private BSTNode root;

    public BSTNode insert(BSTNode node, int data){
        if(node == null){
             node = new BSTNode(data);
        }else{
            if(data < node.data){
                node.left = insert(node.left, data);
            }else{
               node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public boolean search(BSTNode node , int data){
        if(node == null){
            return false;
        }else{
            if(node.data == data){
                return true;
            }else if (data < node.data) {
                return search(node.left, data);
            } else {
              return  search(node.right, data);
            }
        }
    }

    public int count(BSTNode node){
        int c;
        if(node == null) return 0;
        else{   c=1;
                c += count(node.left);
                c +=  count(node.right);
            return c;
            }
        }

        public BSTNode min(BSTNode node){
        if(node == null) return null;
        if(node.left == null) return node;
        else return min(node.left);
        }

        public BSTNode max(BSTNode node){
            if(node == null) return null;
            if(node.right == null) return node;
            else return min(node.right);
        }
        /*
        1. root is null -> return
        2. leaf node ->
        3. left child is null
        4. right child is null
        5. both are not null
        returns: root of the new tree
         */

        public BSTNode delete(BSTNode root, int data){
            if(root == null) return null;
            if(root.data == data){
                if(root.left == null && root.right == null){
                   root = null;
                }else{
                    if(root.left == null){
                        BSTNode temp = root.right;
                        root.right = null;
                        root = temp;
                    }else if(root.right == null){
                        BSTNode temp = root.left;
                        root.left = null;
                        root = temp;
                    }else if(root.left != null && root.right != null){
                        BSTNode temp = min(root.right);
                        root.data = temp.data;
                        root.right = delete(root.right, temp.data);
                    }
                }
            }else if(data > root.data){
                root.right = delete(root.right, data);
            }else if(data < root.data){
                root.left = delete(root.left, data);
            }
            return root;
        }

    public static void main(String[] args){
        BSTOperations operations = new BSTOperations();
        BSTNode root = new BSTNode(20);
        root = operations.insert(root, 8);
        root = operations.insert(root, 22);
        root = operations.insert(root, 4);
        root = operations.insert(root, 12);

        System.out.print(operations.delete(root, 20).data);
    }
}
