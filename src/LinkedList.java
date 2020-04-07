public class LinkedList {
    Node head;

    //adds a node to the end of the list
    static void append(int n, LinkedList t) {
        Node new_node = new Node(n);
        Node last = t.head;

        if(t.head == null) {
            t.head = new_node;
            return;
        }
        new_node.next = null;

        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    public static void printLinkedList(LinkedList list) {   //Print lista
        Node print = list.head;
        System.out.println("\t~Listen~");
        if(print == null) {
            System.out.print("\t| " + "---" + " |\n");
        }
        while (print != null) {
            System.out.print("\t| " + print.data + "\n");
            print = print.next;
        }
    }
}
