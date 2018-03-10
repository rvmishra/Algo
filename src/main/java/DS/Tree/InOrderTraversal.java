package DS.Tree;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class InOrderTraversal implements Traversal {
  public void recursive(Node root) {
    if (root == null)
      return;
    recursive(root.left);
    System.out.print(root.val);
    recursive(root.right);
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
      if (!visited.contains(root)) {
        if (hasLeft(root, visited))
          stack.push(root);
        while (hasLeft(root, visited)) {
          root = root.left;
          stack.push(root);
        }
        visited.add(root);
        System.out.print(root.val);

        if (hasRight(root, visited)) {
          stack.push(root.right);
        }
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
