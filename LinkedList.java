//accesses the Node class
public class LinkedList {
    Node head;

    public class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /*
     * Append to the end of the linkedList.
     * newNode set to null to be the tail.
     * iterate through the whole list until tail, set last pointer to newNode
     */
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        newNode.next = null;
        Node pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = newNode;
        return;
    }

    /*
     * prepend, add data to the head. create newNode, set the newNode pointer to the
     * old head,
     * set the head pointer to the newNode
     */
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /*
     * 1. Check if the given Node is null
     * 2 & 3: Allocate the Node and put in the data
     * 4. Make next of new Node as next of prevNode
     * 5. make next of prevNode as newNode
     */
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    /*
     * This function prints contents of linked list starting from
     * the given node
     */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    //delete node with data
    public void deleteNode(int data) {
        //create two pointers
        Node pointer = head, prev = null;

        //if the data is at the head, set the head to point at the next node
        if (pointer != null && pointer.data == data) {
            head = pointer.next;
            return;
        }
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while(pointer != null && pointer.data != data) {
            prev = pointer;
            pointer = pointer.next;
        }
        // If key was not present in linked list
        if (pointer == null) {
            return;
        }
        //If found, assign the next pointer to the previous pointer.
        prev.next = pointer.next;
    }

    public void deleteNodePosition(int position) {
        //create two pointers
        Node pointer = head;
        //if list empty, return
        if (head == null) {
            return;
        }
        // If head needs to be removed, change head to next pointer
        if (position == 0) {
            head = pointer.next;
            return;
        }
        // Find previous node of the node to be deleted
        for (int i = 0; pointer != null && i < position-1; i++) {
            pointer = pointer.next;
        }
        //set new node to be the one after the node to be deleted
        //set the current pointer to point to the node after the node to be deleted, effectivly unlinking the node from the list
        Node next = pointer.next.next;
        pointer.next = next;
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();

        // Insert 6. So linked list becomes 6->NUllist
        llist.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }
}
