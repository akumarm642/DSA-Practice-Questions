public class ReverseLinkedListV2 {
    public static void main(String[] args) {
        CompleteLinkedList cll = new CompleteLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        ReverseLinkedListV2 rll2 = new ReverseLinkedListV2();
        cll.head = rll2.reverseList(cll.head);
        cll.show();
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        ListNode nxt = head.next;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }
        }
        return prev;
    }
}
