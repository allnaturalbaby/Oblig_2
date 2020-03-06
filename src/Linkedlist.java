public class Linkedlist {
    Node head;

    static void append(int new_data, Linkedlist list) //Setter inn en ny node på slutten av listen
    {
        Node new_node = new Node(new_data);

        if (list.head == null) {
            list.head = new Node(new_data);
        }
    }

    public static void printLinkedList(Linkedlist list) {   //Print lista
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
