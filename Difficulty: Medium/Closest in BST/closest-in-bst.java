/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public int difference(Node root,int k, int min){
        if(root==null)
            return min;
        min=Math.min(Math.abs(root.data-k),min);
        int r=Integer.MAX_VALUE,l=Integer.MAX_VALUE;
        if(root.data>k)
            l=difference(root.left,k,min);
        if(root.data<k)
            r=difference(root.right,k,min);
        return Math.min(min,Math.min(l,r));
    }
    public int minDiff(Node root, int k) {
        return difference(root,k,Integer.MAX_VALUE);
    }
}