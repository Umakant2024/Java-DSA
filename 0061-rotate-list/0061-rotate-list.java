class Solution {

    ListNode FindNth(ListNode head, int k) {
        ListNode t = head;
        int count = 1;
        while (count < k) {
            t = t.next;
            count++;
        }
        return t;
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode r = head;
        int c = 1;

        while (r.next != null) {
            c++;
            r = r.next;
        }

        k %= c;
        if (k == 0)
            return head;

        r.next = head;                  // Make circular

        ListNode temp = FindNth(head, c - k);

        head = temp.next;
        temp.next = null;

        return head;
    }
}