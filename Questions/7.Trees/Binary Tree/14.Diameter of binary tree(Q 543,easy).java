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
    
    public class Dia{
        int ht;
        int dia;
    }
    
    public Dia diameter(TreeNode node){
        if(node == null){
            Dia bp = new Dia();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }
        
        Dia lp = diameter(node.left);
        Dia rp = diameter(node.right);
        
        Dia mp = new Dia();
        
        mp.ht = Math.max(lp.ht,rp.ht) + 1;
        
        int fes = lp.ht + rp.ht + 2;
        mp.dia = Math.max(fes,Math.max(lp.dia,rp.dia));
        
        return mp;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Dia res = diameter(root);
        return res.dia;
    }
}