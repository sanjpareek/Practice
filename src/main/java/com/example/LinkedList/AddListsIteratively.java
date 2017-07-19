package com.example.LinkedList;

/**
 * Created by sanjana on 26/6/17.
 */
public class AddListsIteratively {
    Reversal reversal;
    LinkedListOperations list = new LinkedListOperations();
    LinkedListOperations addLists(LinkedListOperations list1 , LinkedListOperations list2){
        reversal = new Reversal(list1);
        reversal.reverseRecursively(list1.head);
        reversal = new Reversal(list2);
        reversal.reverseRecursively(list2.head);
        Node head1 = list1.head;
        Node head2 = list2.head;
        int carry = 0;
        while(head1 != null && head2 != null){
            int data = head1.data + head2.data + carry ;
            if(data > 9){
                data = data % 10;
                carry = 1;
            }
            list.insertAtHead(data);
            head1 = head1.next;
            head2 = head2.next;
        }
        Node now = null ;
        if(head1 != null) {
             now = head1;
        } else if (head2 != null){
            now = head2;
        }
        while(now != null){
            int data = now.data + carry;
            if(data > 9){
                data = data % 10;
                carry = 1;
            }else{
                carry = 0;
            }
            list.insertAtHead(data);
            now = now.next;
            }
            if(carry >0){
                list.insertAtHead(carry);
            }
            return list;
    }

    public static void main(String[] args){
        AddListsIteratively addLists = new AddListsIteratively();
        LinkedListOperations list1 = new LinkedListOperations();
        LinkedListOperations list2 = new LinkedListOperations();
        // 8999 + 9221 = 18220
        list1.insertAtHead(9);
        list1.insertAtHead(9);
        list1.insertAtHead(9);
        list1.insertAtHead(8);
//        list1.printList(list1.head);
        list2.insertAtHead(1);
        list2.insertAtHead(2);
        list2.insertAtHead(2);
        list2.insertAtHead(9);
//        list2.printList(list1.head);
        LinkedListOperations list3 = addLists.addLists(list1, list2);
        list3.printList(list3.head);
    }
}
