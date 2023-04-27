package code.easy;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 16:19 2023-04-27
 * @ Description：
 */
public class CheckTree2236 {
    /**
     * 判断根结点是否等于子结点之和
     * <p>
     * 给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
     * <p>
     * 如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * <p>
     * 输入：root = [10,4,6]
     * 输出：true
     * 解释：根结点、左子结点和右子结点的值分别是 10 、4 和 6 。
     * 由于 10 等于 4 + 6 ，因此返回 true 。
     * 示例 2：
     * <p>
     * <p>
     * 输入：root = [5,3,1]
     * 输出：false
     * 解释：根结点、左子结点和右子结点的值分别是 5 、3 和 1 。
     * 由于 5 不等于 3 + 1 ，因此返回 false 。
     * <p>
     * <p>
     * 提示：
     * <p>
     * 树只包含根结点、左子结点和右子结点
     * -100 <= Node.val <= 100
     */
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }

}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
