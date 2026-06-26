
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        if(root==null)return result;
       if(root.left!=null) result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        if(root.right!=null)result.addAll(inorderTraversal(root.right));
        return result;
        
    }
}