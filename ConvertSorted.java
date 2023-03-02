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
    public TreeNode sortedArrayToBST(int[] nums) {

        return sorted(nums,0,nums.length-1);
    }
    public TreeNode sorted(int[] nums, int left , int right){

        if(left>right) return null;

        int mid = right+(left-right)/2;
        TreeNode rootNode = new TreeNode(nums[mid]);

        rootNode.left = sorted(nums,left,mid-1);
        rootNode.right = sorted(nums,mid+1,right);

        return rootNode;
    }
}