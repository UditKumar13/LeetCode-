/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        List<List<Integer>> zigzag = new ArrayList<>();
        if(root == null) return zigzag;
        int decision = 1;
        while(!q.isEmpty()){
            int size = q.size();
            
            List<Integer> currNodes = new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode temp = q.remove();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            currNodes.add(temp.val);
            }
            if(decision % 2 == 0) {
                Collections.reverse(currNodes);
                zigzag.add(currNodes);
            }else{
                zigzag.add(currNodes);
            }
            
            
         decision++;   
        }
        
        return zigzag;
    }
}