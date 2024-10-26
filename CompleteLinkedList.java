
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class CompleteLinkedList {
    public static void main(String[] args) {
        CompleteLinkedList ll = new CompleteLinkedList();
        ll.insertAtStart(10);
        ll.insertAtStart(20);
        ll.insertAtStart(30);
        ll.insertAtStart(40);
        ll.insertAtStart(50);
        ll.insertAt(3, 60);
        ll.deleteAt(5);
        ll.show();

    }

    ListNode head;

    public void insert(int data) {
        ListNode newNode = new ListNode();
        newNode.val = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void show() {
        ListNode temp = head;
        while (temp.next != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public void insertAtStart(int data) {
        ListNode newNode = new ListNode();
        newNode.val = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        ListNode newNode = new ListNode();
        newNode.val = data;
        if (index == 0) {
            insertAtStart(data);
        } else {
            ListNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            ListNode newNode = head;
            ListNode temp = null;
            for (int i = 0; i < index - 1; i++) {
                newNode = newNode.next;
            }
            temp = newNode.next;
            newNode.next = temp.next;
            temp = null;

        }
    }

}