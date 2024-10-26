public class DeleteTheMiddleElementOfTheLinkedList {
    public static void main(String args[]) {
        CompleteLinkedList cll = new CompleteLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        DeleteTheMiddleElementOfTheLinkedList dmll = new DeleteTheMiddleElementOfTheLinkedList();
        System.out.println(dmll.deleteMiddle(cll.head).val);
        cll.show();

    }

    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode preSlow = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            preSlow = slow;
            slow = slow.next;

        }
        preSlow.next = preSlow.next.next;
        return head;

    }
}