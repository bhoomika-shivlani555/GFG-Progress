/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        if(arr.length==0)
            return null;
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int x=1;x<arr.length;x++)
        {
            Node nn=new Node(arr[x]);
            temp.next=nn;
            temp=nn;
        }
        return head;
    }
}
