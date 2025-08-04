import linked_list.IntersectionOfTwoLinkedLists_160;
import linked_list.ListNode;

public class Main {
    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists_160 cls = new IntersectionOfTwoLinkedLists_160();

        ListNode intersect = new ListNode(8);
        ListNode intersect01 = new ListNode(4);
        intersect.next = intersect01;

        ListNode intersect02 = new ListNode(5);
        intersect01.next = intersect02;


        ListNode headA = new ListNode(4);
        ListNode headA01 = new ListNode(1, intersect);
        headA.next = headA01;

        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, intersect)));

        cls.getIntersectionNode(headA, headB);


    }


}
