class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;

        while(head != null && head.val == val) {
            head = head.next;
        }

        if(head == null) return head;

        ListNode temp = head;
        ListNode curr = head;

        while(curr != null) {
            curr = curr.next;
            if(curr != null && curr.val == val) {
                while(curr != null && curr.val == val) {
                    curr = curr.next;
                }
                temp.next = curr;
            }
            temp = temp.next;
        }
        return head;
    }
}