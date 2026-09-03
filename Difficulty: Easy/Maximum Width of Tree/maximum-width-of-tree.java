/* Structure of a Binary Tree
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    public int maxWidth(Node root) {
        Queue<Node> q=new LinkedList<>();
        if(root==null)
            return 0;
        q.offer(root);
        q.offer(null);
        int count=0,max=0;
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                max=Math.max(max,count);
                if(q.isEmpty())
                    return max;
                q.offer(null);
                count=0;
            }
            else
            {
                count++;
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }
        }
        return max;
    }
}