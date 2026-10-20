package LinkedList;

public class ReverseLL {
    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.print("Original List :" );
        printlist(head);
        head = reverse(head);
        System.out.print("Reversed List :");
        printlist(head);
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void printlist(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.val +" ");
            head = head.next;
        }
        System.out.println();
    }
}
