class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null) return null;

        ListNode temp = head;

        int len = getSize(temp);

        return ammendList(head, temp, len, n);

    }

    private static int getSize(ListNode temp) {

        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    private static ListNode ammendList(ListNode head, ListNode temp, int len, int n) {

        if(len - n == 0) return head.next;

        for(int i = 0; i < (len - n) - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}