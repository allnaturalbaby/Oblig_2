public class MergeSort {
    static void mergeSort(LinkedList first, LinkedList second, LinkedList target) {
        while (first.head != null && second.head != null) {
            if (first.head.data > second.head.data) {
                LinkedList.append(second.head.data, target);
                second.head = second.head.next;
            } else {
                LinkedList.append(first.head.data, target);
                first.head = first.head.next;
            }
            if(first.head == null) {
                LinkedList.append(second.head.data, target);
                second.head = second.head.next;
            }
        }
    }
}
