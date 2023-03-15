package Daily_challenge;
import java.util.*;

// public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode() {}
//     *     TreeNode(int val) { this.val = val; }
//     *     TreeNode(int val, TreeNode left, TreeNode right) {
//     *         this.val = val;
//     *         this.left = left;
//     *         this.right = right;
//     *     }
//     * }
public class BinaryComplete {

    public boolean isCompleteTree(TreeNode root) {
        if(root==null){
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();

        boolean flag = false;
        q.add(root);

        while(!q.isEmpty()){
            TreeNode temp = q.remove();

            if(temp.left!=null){

                if(flag==true){
                    return false;
                }
                q.add(temp.left);
            }
            else{
                flag=true;
            }

            if(temp.right!=null){

                if(flag==true){
                    return false;
                }
                q.add(temp.right);
            }
            else{
                flag =true;
            }
        }
        return true;
    }

    
}
