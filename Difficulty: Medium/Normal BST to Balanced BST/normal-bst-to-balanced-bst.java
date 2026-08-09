/* BST Node Structure
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/


class Solution {
    public void inorder(Node root,ArrayList<Integer> list){
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    public Node toBST(ArrayList<Integer> list, int start, int end)
    {
        if(start>end)
            return null;

        int mid=start+(end-start)/2;
        Node nn= new Node(list.get(mid));
        nn.left=toBST(list,start,mid-1);
        nn.right=toBST(list,mid+1,end);
        return nn;
    }
    public Node balanceBST(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        return toBST(list,0,list.size()-1);
    }
}