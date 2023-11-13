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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode fast = temp;
        ListNode slow = temp;
        if(head.next==null && n==1){
            return null;
        }
        for(int i=1;i<=n;i++)
            fast = fast.next;

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
    int getSize(ListNode head){
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
            }
            return count;
    }
}
