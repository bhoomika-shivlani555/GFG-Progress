/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    boolean ans=true;
    public int height(Node root)
    {
        if(root==null)
            return 0;
        int lefth=height(root.left);
        int righth=height(root.right);
        int bf=lefth-righth;
        if(bf!=0 && bf!=1 &&bf!=-1)
            ans=false;
        return Math.max(lefth,righth)+1;
    }
    public boolean isBalanced(Node root) {
        height(root);
        return ans;
    }
}