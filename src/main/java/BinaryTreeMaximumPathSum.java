public class BinaryTreeMaximumPathSum {

     //Definition for a binary tree node.
      public static class TreeNode {
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

    static class Solution
    {
        static int res=Integer.MIN_VALUE;
        static int helper(TreeNode root)
        {
            if(root==null)
            {
                return 0;
            }

            int left = helper(root.left);
            int right = helper(root.right);
            left = Math.max(0,left);
            right = Math.max(0,right);
            res = Math.max(res,root.val+right+left);
            return root.val+Math.max(left,right);

        }
        public int maxPathSum(TreeNode root)
        {
            int ok = helper(root);
            int max = res;
            res=Integer.MIN_VALUE;
            return max;
        }
    }
}
