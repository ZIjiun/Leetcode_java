/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ite = head;
        ListNode tmp;

        while(ite != null) {
            tmp = ite.next;
            while(tmp != null && ite.val == tmp.val) {
                // 一直往後刪除
                tmp = tmp.next;
            }
            ite.next = tmp;
            ite = tmp;
        }

        return head;
    }
}
