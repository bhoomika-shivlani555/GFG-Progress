/* Structure of Binary Tree Node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    void mirror(Node root) {
        {
            if(root==null)
                return ;
            if(root.left==null && root.right==null)
                return;
                
            if(root.left!=null && root.right==null)
            {
                root.right=root.left;
                root.left=null;
                mirror(root.right);
            }
            
            else if(root.right!=null && root.left==null)
            {
                root.left=root.right;
                root.right=null;
                mirror(root.left);
            }
            
            else
            {
                Node temp=root.right;
                root.right=root.left;
                root.left=temp;
                mirror(root.left);
                mirror(root.right);
            }
        }
    }
}