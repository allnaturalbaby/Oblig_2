public class MergeSort {
    static void mS(LinkedList f, LinkedList s, LinkedList t) {
        while(f.head != null && s.head != null) {
            if(f.head.data <= s.head.data) {
                LinkedList.append(f.head.data, t);
                f.head = f.head.next;
            } else {
                LinkedList.append(s.head.data, t);
                s.head = s.head.next;
            }
        }
        while(f.head != null) {
            LinkedList.append(f.head.data, t);
            f.head = f.head.next;
        }
        while(s.head != null) {
            LinkedList.append(s.head.data, t);
            s.head = s.head.next;
        }
    }
}
