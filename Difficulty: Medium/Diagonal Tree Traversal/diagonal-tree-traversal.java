/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree {
    public void traversal(Node root,HashMap<Integer,ArrayList<Integer>> map,int dia)
    {
        if(root==null)
            return;
        if(map.containsKey(dia))
        {
            ArrayList<Integer> list=map.get(dia);
            list.add(root.data);
            map.put(dia,list);
        }
        else
        {
           ArrayList<Integer> list=new ArrayList<>();
           list.add(root.data);
           map.put(dia,list);
        }
        traversal(root.left,map,dia+1);
        traversal(root.right,map,dia);
        
    }
    public ArrayList<Integer> diagonal(Node root) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        traversal(root,map,0);
        for(int x:map.keySet())
        {
            ArrayList<Integer> list=map.get(x);
            // Collections.sort(list);
            for(int y=0;y<list.size();y++)
                ans.add(list.get(y));
        }
        return ans;
    }
}