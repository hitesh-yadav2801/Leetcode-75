class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, cur = head;
        while(head != null){
            head = head.next;
            cur.next = prev;
            prev = cur;
            cur = head;
        }
        return prev;
    }
}
