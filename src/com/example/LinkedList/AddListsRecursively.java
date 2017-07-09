package com.example.LinkedList;

/**
 * Created by sanjana on 4/7/17.
 * input : two lists
 * process:
 * 1. check length of lists and find the diff
 * 2. move pointer of longer list by the difference
 * 3. recursively call the add function
 *
 */

public class AddListsRecursively {
    LinkedListOperations result;
    private int getLength(Node head){
        int length = 0;
      while (head != null){
          length++;
      }
      return length;
    }

    private void addList(Node head1, Node head2){
        int sum, carry=0;
        if(head1 == null || head2 == null){
            sum = head1.data + head2.data + carry;
            if(sum>9){
                carry = 1;
                sum = sum % 10;
                result.insertAtHead(sum);
            }
            addList(head1.next, head2.next);
        }
    }

    private void addListDriver(Node head1, Node head2){
        int length1 = getLength(head1);
        int length2 = getLength(head2);
        int diff = 0;
        if(length1 > length2){
            Node temp = head1;
            head1 = head2;
            head2 = temp;
            diff = length1 - length2;
        }else {
            diff = length2 - length1;
        }
            for(int i =0; i<diff; i++){
                head1 = head1.next;
            }

    }
}
