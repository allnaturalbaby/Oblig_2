public class Execute {
    public static void main (String [] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        LinkedList.append(15, list);
        LinkedList.append(10, list);
        LinkedList.append(5, list);

        LinkedList.append(20, list2);
        LinkedList.append(3, list2);
        LinkedList.append(2, list2);

        LinkedList.printLinkedList(list);

        System.out.println("woah");
        System.out.println("shalabais123123");
        LinkedList.printLinkedList(list2);
    }
}
