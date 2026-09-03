/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    class info{
        int ht;
        int dia;
        
        info(int d,int h)
        {
            this.ht=h;
            this.dia=d;
        }
    }
    public info diameterfun(Node root)
    {
        if(root==null)
            return new info(0,0);
            
        info leftinfo=diameterfun(root.left);
        info rightinfo=diameterfun(root.right);
        
        int maxdia=Math.max(rightinfo.ht+leftinfo.ht,Math.max(rightinfo.dia,leftinfo.dia));
        int maxht=Math.max(rightinfo.ht,leftinfo.ht)+1;
        
        return new info(maxdia,maxht);
    }
    public int diameter(Node root) {
        info ans=diameterfun(root);
        return ans.dia;
    }
}