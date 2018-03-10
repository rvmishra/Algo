package DS.Tree;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class PostOrderTraversal implements Traversal{
  public void recursive(Node root) {
    if (root == null)
      return;
    recursive(root.left);
    recursive(root.right);
    System.out.print(root.val);
  }

  public void iterative(Node root) {
    if (root == null) {
      return;
    }
    Deque<Node> stack = new LinkedList<>();
    Set<Node> visited = new HashSet<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      root = stack.pop();
      if (hasRight(root, visited) || hasLeft(root, visited)) {
        stack.push(root);
        if (hasRight(root, visited)) {
          stack.push(root.right);
        }
        if (hasLeft(root, visited)) {
          stack.push(root.left);
        }
      } else {
        visited.add(root);
        System.out.print(root.val);
      }
    }
  }

  private boolean hasRight(Node root, Set<Node> visited) {
    return root.right != null && !visited.contains(root.right);
  }

  private boolean hasLeft(Node root, Set<Node> visited) {
    return root.left != null && !visited.contains(root.left);
  }
}
