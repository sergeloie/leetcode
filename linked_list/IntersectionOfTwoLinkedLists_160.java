package linked_list;

public class IntersectionOfTwoLinkedLists_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = getLength(headA);
        int b = getLength(headB);
        int diff = Math.abs(a - b);

        if (a > b) {
            for (int i = 0; i < diff; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;

    }

    private int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        int count = 1;
        while (head.next != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}
