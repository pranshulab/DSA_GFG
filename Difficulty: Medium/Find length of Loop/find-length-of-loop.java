/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head,
            fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                break;
            }
        }
        if( fast == null || fast.next == null ) {
            return 0;
        }
        
        
        Node n1 = head,
            n2 = slow;
        
        
        while( n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
            
        }
        
        int len = 1;
        Node curr = n1.next;
        
        while ( curr != n1 ) {
            len = len + 1;
            curr = curr.next;
        }
        return len;
        
    }
    
}