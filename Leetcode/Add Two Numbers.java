/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode lp = l3;
        while(l1.next!=null&&l2.next!=null){
            lp.val = lp.val+l1.val+l2.val;
            lp.next = new ListNode(0);
            if(lp.val >= 10){
                lp.next.val += 1;
                lp.val = lp.val - 10;
            }
            l1=l1.next;
            l2=l2.next;
            lp=lp.next;
        }
        if(l1.next == null && l2.next != null){
            lp.val = lp.val+l1.val+l2.val;
            lp.next = new ListNode(0);
            if(lp.val >= 10){
                lp.next.val += 1;
                lp.val = lp.val - 10;
            }
            lp=lp.next;
            l2=l2.next;
            while(l2.next != null){
                lp.val += l2.val;
                lp.next = new ListNode(0);
                if(lp.val >= 10){
                    lp.next.val += 1;
                    lp.val = lp.val - 10;
                }
                lp=lp.next;
                l2=l2.next;
            }
            lp.val += l2.val;
            if(lp.val >= 10){
                lp.next = new ListNode(0);
                lp.next.val += 1;
                lp.val = lp.val - 10;
            }
        }
        else if(l1.next != null && l2.next == null){
            lp.val = lp.val+l1.val+l2.val;
            lp.next = new ListNode(0);
            if(lp.val >= 10){
                lp.next.val += 1;
                lp.val = lp.val - 10;
            }
            lp=lp.next;
            l1=l1.next;
            while(l1.next != null){
                lp.val += l1.val;
                lp.next = new ListNode(0);
                if(lp.val >= 10){
                    lp.next.val += 1;
                    lp.val = lp.val - 10;
                }
                lp=lp.next;
                l1=l1.next;
            }
            lp.val += l1.val;
            if(lp.val >= 10){
                lp.next = new ListNode(0);
                lp.next.val += 1;
                lp.val = lp.val - 10;
            }
        }
        else if(l1.next == null && l2.next == null){
            lp.val = lp.val+l1.val+l2.val;
            if(lp.val >= 10){
                lp.next = new ListNode(0);
                lp.next.val += 1;
                lp.val = lp.val - 10;
            }
        }
        return l3;
            
        }
    }
