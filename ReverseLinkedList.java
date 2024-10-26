
public class ReverseLinkedList {
    public static void main(String[] args) {
        CompleteLinkedList cll = new CompleteLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        ReverseLinkedList rll = new ReverseLinkedList();
        cll.head = rll.reverseList(cll.head);
        cll.show();
    }

    public ListNode reverseList(ListNode head) {
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