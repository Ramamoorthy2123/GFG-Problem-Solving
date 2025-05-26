class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node temp = head;
        Node res = new Node(data);
        if(data < temp.data){
            res.next = head;
            head = res;
            while(temp.data <= temp.next.data)
                temp = temp.next;
            temp.next = head;
        }
        while(temp.data <= temp.next.data){
            if(data > temp.data && data <= temp.next.data){
                res.next = temp.next;
                break;
            }
            temp = temp.next;
        }
        temp.next = res;
        if(res.next == null)
            res.next = head;
        return head;
    }
}
