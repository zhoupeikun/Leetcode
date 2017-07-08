// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its level order traversal as:
// [
//   [3],
//   [9,20],
//   [15,7]
// ]


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      ArrayList<Integer> nodeValues = new ArrayList<>();


      if (root == null) {
        return result;
      }

      LinkedList<TreeNode> current = new LinkedList<>();
      LinkedList<TreeNode> next = new LinkedList<>();
      current.add(root);

      while(!current.isEmpty()) {
        // remove()，Retrieves and removes the head (first element) of this list
        // Remove the first element of LinkedList and return the LinkedList
        TreeNode node = current.remove();
        // Add the current node's value into nodeValues
        nodeValues.add(node.val);

        if (node.left != null) {
          next.add(node.left);
        }
        if (node.right != null) {
          next.add(node.right);
        }

        // When one level is already over, update current and next with childs.
        if (current.isEmpty) {
          current = next;
          next = new LinkedList<>();
          result.add(nodeValues);
          nodeValues = new ArrayList();

        }
      }

      return result;

    }
}
