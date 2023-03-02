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
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
        TreeNode() {}
         TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
             this.left = left;
             this.right = right;
        }
 }
class ConvertSorted {
    public static TreeNode sortedArrayToBST(int[] nums) {

        return sorted(nums,0,nums.length-1);
    }
    public static  TreeNode sorted(int[] nums, int left , int right){

        if(left>right) return null;

        int mid = right+(left-right)/2;
        TreeNode rootNode = new TreeNode(nums[mid]);

        rootNode.left = sorted(nums,left,mid-1);
        rootNode.right = sorted(nums,mid+1,right);

        return rootNode;
    }

     public static void main(String[] args) {
        int nums[] = {-3,-10,0,9,5};
        sortedArrayToBST(nums);
        for(int i=0;i<nums.length;i++){
               System.out.print(nums[i]+" ");
        }
        
    }
}
