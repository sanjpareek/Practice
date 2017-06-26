package com.example.LinkedList;

/**
 * Created by sanjana on 26/6/17.
 */
public class Reversal {
    LinkedListOperations list;

    void reverseIteratively(){
        Node previous =  null;
        Node current = list.head;
        Node next ;
        while(current.next != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        list.head = current;
    }

    void reverseRecursively(Node n){
        if(n.next == null){
            list.head = n;
            return;
        }
        reverseRecursively(n.next);
        Node q = n.next; // store the next node
        q.next = n; // point next node to current node
        n.next = null;

    }


    public static void main(String[] args){
        Reversal reversal = new Reversal();
        reversal.list = new LinkedListOperations();
        reversal.list.insertAtPos(10,1);
        reversal.list.insertAtPos(20,2);
        reversal.list.insertAtPos(30,3);
        reversal.list.insertAtPos(40,4);
        reversal.list.insertAtPos(50,5);
        reversal.list.insertAtTail(60);
        System.out.print("Initial List : ");
        reversal.list.printList(reversal.list.head);

//        reversal.reverseIteratively();
        reversal.reverseRecursively(reversal.list.head);
        System.out.print("After reversal : ");
        reversal.list.printList(reversal.list.head);
    }
}
