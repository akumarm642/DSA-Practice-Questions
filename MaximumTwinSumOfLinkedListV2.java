public class MaximumTwinSumOfLinkedListV2 {
    public static void main(String[] args) {
        CompleteLinkedList cll = new CompleteLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(1000);
        cll.insert(60);
        MaximumTwinSumOfLinkedListV2 mts2 = new MaximumTwinSumOfLinkedListV2();
        System.out.println(mts2.pairSum(cll.head));
    }

    private int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode pres = slow;
        ListNode nxt = pres.next;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }
        }
        ListNode frst = head;
        ListNode scnd = prev;
        int max = Integer.MIN_VALUE;
        while (scnd != null) {
            int sum = scnd.val + frst.val;
            max = Math.max(max, sum);
            frst = frst.next;
            scnd = scnd.next;
        }
        return max;
    }
}
