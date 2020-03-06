public class LinkedList {
    Node head;

    static void mergeSort(LinkedList first, LinkedList second, LinkedList target) {
        while (first.head != null && second.head != null) {
            if (first.head.data > second.head.data) {
                append(second.head.data, target);
                second.head = second.head.next;
            } else {
                append(first.head.data, target);
                first.head = first.head.next;
            }
            if(first.head == null) {
                append(second.head.data, target);
                second.head = second.head.next;
            }
        }
    }

    static void append(int new_data, LinkedList list) {
        Node new_node = new Node(new_data);
        Node last = list.head;

        if(list.head == null) {
            list.head = new_node;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
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
