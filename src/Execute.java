public class Execute {
    public static void main (String [] args){
        System.out.println("Dick");

        Linkedlist list = new Linkedlist();
        Linkedlist list2 = new Linkedlist();

        Linkedlist.append(1, list);
        Linkedlist.append(2, list2);

        Linkedlist.printLinkedList(list);

        System.out.println("woah");

        Linkedlist.printLinkedList(list2);
    }
}
