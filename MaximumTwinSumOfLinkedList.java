public class MaximumTwinSumOfLinkedList {
    public static void main(String[] args) {
        CompleteLinkedList cll = new CompleteLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(1000);
        cll.insert(60);
        MaximumTwinSumOfLinkedList mts = new MaximumTwinSumOfLinkedList();
        System.out.println(mts.pairSum(cll.head));
    }

    public int pairSum(ListNode head) {
        int n = 1, i = 0;
        ListNode temp = head;
        while (temp.next != null) {
            n++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        while (i < n / 2 - 1) {
            temp1 = temp1.next;
            i++;
        }
        ListNode newHead = temp1.next;
        temp1.next = null;
        newHead = reverseList(newHead);
        int max = 0, sum = 0;
        ListNode temp2 = head;
        ListNode temp3 = newHead;
        while (temp2 != null) {
            sum = temp2.val + temp3.val;
            if (sum > max) {
                max = sum;
            }
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        return max;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        return prevNode;
    }
}
