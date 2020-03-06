public class LinkedList {
    Node head;

    static void append(int new_data, LinkedList list) //Setter inn en ny node på slutten av listen
    {
        Node new_node = new Node(new_data);
        Node temp = list.head;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
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
