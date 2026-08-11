/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */

class Solution {
    class Info{
        boolean isBST;
        int size,min,max;
        Info(boolean isBST, int size, int min,int max)
        {
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public int maxsize=1;
    public Info tree(Node root)
    {
        if(root==null)
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
            
        Info leftInfo=tree(root.left);
        Info rightInfo=tree(root.right);
        
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        
        int size=leftInfo.size+rightInfo.size+1;
        
        if(leftInfo.max>=root.data || rightInfo.min<=root.data)
            return new Info(false,size,min,max);
        if(leftInfo.isBST && rightInfo.isBST)
        {   
            maxsize=Math.max(size,maxsize);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }
    public int largestBst(Node root) {
        tree(root);
        return maxsize;
    }
}