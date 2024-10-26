public class OddEvenList {
    public static void main(String[] args) {
        CompleteLinkedList cll = new CompleteLinkedList();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        cll.insert(6);
        OddEvenList oel = new OddEvenList();
        oel.oddEvenList(cll.head);
        System.out.println();
        // System.out.println(oel.oddEvenList(cll.head).val);
        cll.show();
    }

    private ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        ListNode odd = head;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}