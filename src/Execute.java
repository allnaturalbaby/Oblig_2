public class Execute extends LinkedList {
    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        //first list
        LinkedList.append(5, list);
        LinkedList.append(10, list);
        LinkedList.append(15, list);

        //second list
        LinkedList.append(2, list2);
        LinkedList.append(3, list2);
        LinkedList.append(20, list2);

        LinkedList.printLinkedList(list);
        System.out.println("----------");
        LinkedList.printLinkedList(list2);
        System.out.println("----------");

        /* ----------------------------- */

        LinkedList targetList = new LinkedList();
        //targetList.head = null;
        mergeSort(list, list2, targetList);
        printLinkedList(targetList);
    }
}
