/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public void leftDfs(Node root,ArrayList<Integer> list){
        
        if(root==null || (root.left==null && root.right==null))
            return;
        
        list.add(root.data);
        if(root.left!=null)
            leftDfs(root.left,list);
        else
            leftDfs(root.right,list);
        
    }
    public void leaves(Node root,ArrayList<Integer> list)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            list.add(root.data);
            return;
        }
        leaves(root.left,list);
        leaves(root.right,list);
        
    }
    public void rightDfs(Node root,ArrayList<Integer> list1){
        
        if(root==null || (root.left==null && root.right==null))
            return;
        
        list1.add(root.data);
        if(root.right!=null)
            rightDfs(root.right,list1);
        else
            rightDfs(root.left,list1);
        
    }
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        
       if(root==null)
        return list;
        
        if(root.left == null && root.right == null) {
            list.add(root.data);
            return list;
        }
        
        list.add(root.data);
        
        leftDfs(root.left,list);
        leaves(root,list);
        rightDfs(root.right,list1);
        
        Collections.reverse(list1);
        list.addAll(list1);
        return list;
    }
}