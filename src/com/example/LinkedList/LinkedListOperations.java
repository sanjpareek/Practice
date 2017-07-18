package com.example.LinkedList;


/**
 * Created by sanjana on 26/6/17.
 */

public class LinkedListOperations {
    private int size = 0;
    public Node head;
    public LinkedListOperations(){
        head = null;
    }

    void insertAtHead(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
        size++;
    }

    void insertAtTail(int d){
        Node newNode = new Node(d);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    void insertAtPos(int d, int position){
        if(position == 1 || head == null){
            insertAtHead(d);
            return;
        }
        Node newNode = new Node(d);
        Node temp = head;
        for(int i = 0; i < position-2; i++){
           temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    void delete(int position){
        if(position > size){
            System.out.println("Invalid value for position");
            return;
        }
        if(head == null){
            System.out.println("No nodes to delete");
            return;
        }
        if(position == 1 && size == 1){
            head = null;
            size--;
            return;
        }
        Node temp = head;
        for(int i = 0; i < position-2; i++){
            temp = temp.next;
        }

        Node del = temp.next;
        System.out.println("node to delete : " + del.data);
        temp.next = temp.next.next;
        del.next = null;
        size--;
    }

    void printList(Node node){
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }


    void printReverse(Node n){
        if(n == null) return;
        printReverse(n.next);
        System.out.println(n.data);
    }

    int getSize(Node node){
        int size = 0;
        while(node != null){
            size++;
        }
        return size;
    }
    public static void main(String[] args){
        LinkedListOperations linkedListOperations = new LinkedListOperations();
        linkedListOperations.insertAtHead(10);
        linkedListOperations.insertAtHead(20);
        linkedListOperations.insertAtTail(30);
        linkedListOperations.insertAtTail(40);
        linkedListOperations.insertAtPos(50, 3);
//        linkedListOperations.printList();
        linkedListOperations.delete(4);
        linkedListOperations.printList(linkedListOperations.head);
    }
}
