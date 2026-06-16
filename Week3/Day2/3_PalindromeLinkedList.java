class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        //reverse the second half of the list
        ListNode prev=null,temp=s;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        ListNode first=head,second=prev;
        while(second!=null){
            if(first.val!=second.val){
                return false;
                }
            first=first.next;
            second=second.next;
        }
        return true;
    }
}
