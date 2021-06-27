/*
 * Name: Saksham Sharma
 * University Roll.No.: 191500698
 * Section/Roll.no: B-24
 */

public class doublyLL {
    static class Node {
        public int data;
        public Node next;
        public Node prev;

        public void displayNodeData(int addDigit) {
            data = data + addDigit;
            System.out.print(" (" + data + ") ");
        }
    }

    public static class DoublyLinkedList {

        private Node head;
        private Node tail;
        int size;

        public boolean isEmpty() {
            return (head == null);
        }

        // used to insert a node at the last of linked list
        public void insertLast(int data) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            newNode.prev=tail;
            if(tail!=null)
                tail.next=newNode;
            tail = newNode;
            if(head==null)
                head=newNode;
            size++;
        }

        public void printLinkedListForward() {
            System.out.println("Printing Doubly LinkedList (head --> tail) ");
            Node current = head;
            while (current != null) {
                int addDigit;
                addDigit = 10;
                current.displayNodeData(addDigit);
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        DoublyLinkedList myLinkedlist = new DoublyLinkedList();
        myLinkedlist.insertLast(5);
        myLinkedlist.insertLast(6);
        myLinkedlist.insertLast(7);
        myLinkedlist.insertLast(1);
        myLinkedlist.printLinkedListForward();

        System.out.println("================");

        //number which we want to add in each node...
        int addDigit;
        addDigit = 10;

    }
}