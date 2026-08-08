/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void path(ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> list ,Node root)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            list.add(root.data);
            ans.add(new ArrayList<>(list));
            return;
        }
            
        list.add(root.data);
        int size=list.size();
        
        path(an
        s,list,root.left);
        list.subList(size,list.size()).clear();
        path(ans,list,root.right);
        list.subList(size,list.size()).clear();
    }
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        path(ans,list,root);
        return ans;
    }
}