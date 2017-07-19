package com.example.BST;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sanjana on 17/7/17.
 *
 * insert, delete, count nodes, search, inorder, preorder, postorder, isBST, print level-wise
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

        public int findHeight(BSTNode root){
            if(root == null) return 0;
            else {
                return maxVal(findHeight(root.left),findHeight(root.right) + 1);
            }
        }

        public int maxVal(int a, int b){
            return a>b?a:b;
        }

        public void preOrderTraversal(BSTNode root){
            if(root == null) return;
            else
                System.out.println(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public void inOrderTraversal(BSTNode root){
            if(root == null) return;
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }

    public void postOrderTraversal(BSTNode root){
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }

        public void printLevelOrder(BSTNode root){
            if(root == null) return;
            Queue<BSTNode> queue = new LinkedList<BSTNode>();
            queue.add(root);
            while(!queue.isEmpty()){
                BSTNode temp = queue.poll();
                System.out.println(temp.data);
                if(temp.left!= null)
                    queue.add(temp.left);
                if(temp.right!= null)
                    queue.add(temp.right);
            }
        }

        public void printLevelWise(BSTNode root){
            if(root == null) return;
            Queue<BSTNode> queue = new LinkedList<BSTNode>();
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                while(size > 0){
                    BSTNode temp = queue.poll();
                    System.out.print(temp.data + " ");
                    size--;
                    if(temp.left!= null)
                        queue.add(temp.left);
                    if(temp.right!= null)
                        queue.add(temp.right);
                }
                System.out.println();
            }
        }

        public void isBST(BSTNode root){
           System.out.print(isBSTUtil(root, 1000, 2000));
        }

        public boolean isBSTUtil(BSTNode root, int min, int max){
            if(root == null) return true;
            if(root.data > max || root.data < min) return false;
            return isBSTUtil(root.left, min, root.data-1) && isBSTUtil(root.right, root.data+1 , max);
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

        public BSTNode getInorderSucc(BSTNode node){
            if (node == null) return null;
            if(node.right == null) return  null;
            node = node.right;
            if(node.left != null){
                BSTNode temp = node;
                while(temp.left!= null)
                    temp = temp.left;
                return temp;
            }else
                return node;
        }

    public static void main(String[] args){
        BSTOperations operations = new BSTOperations();
        BSTNode root = new BSTNode(20);
        root = operations.insert(root, 8);
        root = operations.insert(root, 22);
        root = operations.insert(root, 4);
        root = operations.insert(root, 12);
        root = operations.insert(root, 30);
        root = operations.insert(root, 11);
        BSTNode node = new BSTNode(8);

//        operations.printLevelWise(root);
//        operations.isBST(root);
        BSTNode a = operations.getInorderSucc(root.right);
        if( a != null){
            System.out.print(a.data);
        }else{
            System.out.print("Leaf node has no successors");
        }

    }
}
