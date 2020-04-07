public class Execute extends LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        //first list
        LinkedList.append(1, list);
        LinkedList.append(3, list);
        LinkedList.append(5, list);
        LinkedList.append(7, list);
        LinkedList.append(9, list);
        LinkedList.append(11, list);
        LinkedList.append(13, list);
        LinkedList.append(15, list);
        LinkedList.append(17, list);
        LinkedList.append(19, list);

        //second list
        LinkedList.append(2, list2);
        LinkedList.append(4, list2);
        LinkedList.append(6, list2);
        LinkedList.append(8, list2);
        LinkedList.append(10, list2);
        LinkedList.append(12, list2);
        LinkedList.append(14, list2);
        LinkedList.append(16, list2);
        LinkedList.append(18, list2);
        LinkedList.append(20, list2);

        LinkedList.printLinkedList(list);
        System.out.println("----------");
        LinkedList.printLinkedList(list2);
        System.out.println("----------");

        /* ----------------------------- */

        LinkedList targetList = new LinkedList();
        //targetList.head = null;
        MergeSort.mS(list, list2, targetList);
        printLinkedList(targetList);
    }
}
