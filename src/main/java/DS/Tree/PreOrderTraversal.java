package DS.Tree;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class PreOrderTraversal implements Traversal {
  public void recursive(Node root) {
    if (root == null)
      return;
    System.out.print(root.val);
    recursive(root.left);
    recursive(root.right);
  }

  public void iterative(Node root) {
    if (root == null) {
      return;
    }
    Deque<Node> stack = new LinkedList<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      root = stack.pop();
      System.out.print(root.val);
      if (root.right != null) {
        stack.push(root.right);
      }
      if (root.left != null) {
        stack.push(root.left);
      }
    }
  }

}
