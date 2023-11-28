class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
}