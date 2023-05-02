import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;


import javax.swing.tree.TreeNode;

/** 
*
* @author <Alexander Berg>
* @since <pre>May 2, 2023</pre> 
* @version 1.0 
*/





public class BinaryTreeMaximumPathSumTest {

    @Test
    public void testMaxPathSumExample1() {
        // Input: root = [1,2,3]
        // Output: 6
        BinaryTreeMaximumPathSum.TreeNode n2 = new BinaryTreeMaximumPathSum.TreeNode(2);
        BinaryTreeMaximumPathSum.TreeNode n3 = new BinaryTreeMaximumPathSum.TreeNode(3);
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(1, n2, n3);
        BinaryTreeMaximumPathSum.Solution s = new BinaryTreeMaximumPathSum.Solution();
        assertEquals(6, s.maxPathSum(root));
    }

    @Test
    public void testMaxPathSumExample2() {
        // Input: root = [-10,9,20,null,null,15,7]
        // Output: 42
        BinaryTreeMaximumPathSum.TreeNode n9 = new BinaryTreeMaximumPathSum.TreeNode(9);
        BinaryTreeMaximumPathSum.TreeNode n15 = new BinaryTreeMaximumPathSum.TreeNode(15);
        BinaryTreeMaximumPathSum.TreeNode n7 = new BinaryTreeMaximumPathSum.TreeNode(7);
        BinaryTreeMaximumPathSum.TreeNode n20 = new BinaryTreeMaximumPathSum.TreeNode(20, n15, n7);
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(-10, n9, n20);
        BinaryTreeMaximumPathSum.Solution s = new BinaryTreeMaximumPathSum.Solution();
        assertEquals(42, s.maxPathSum(root));
    }

    @Test
    public void testMaxPathSumSingleNode() {
        // Input: root = [10]
        // Output: 10
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(10);
        BinaryTreeMaximumPathSum.Solution s = new BinaryTreeMaximumPathSum.Solution();
        assertEquals(10, s.maxPathSum(root));
    }

    @Test
    public void testMaxPathSumNegativeNode() {
        // Input: root = [-10]
        // Output: -10
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(-10);
        BinaryTreeMaximumPathSum.Solution s = new BinaryTreeMaximumPathSum.Solution();
        assertEquals(-10, s.maxPathSum(root));
    }

    @Test
    public void testMaxPathSumTwoNodes() {
        // Input: root = [2,-1]
        // Output: 2
        BinaryTreeMaximumPathSum.TreeNode nMinus1 = new BinaryTreeMaximumPathSum.TreeNode(-1);
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(2, nMinus1, null);
        BinaryTreeMaximumPathSum.Solution s = new BinaryTreeMaximumPathSum.Solution();
        assertEquals(2, s.maxPathSum(root));
    }
}



