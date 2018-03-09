package DS.LinkedList;

import java.util.ArrayList;

public class ReverseListInKBlocks {
  public static void run() {
    Node curr = new Node(1);
    curr.addNode(2);
    curr.addNode(3);
    curr.addNode(4);
    curr.addNode(5);
    NodeUtils.printList(curr);
    NodeUtils.printList(reverseInBlocks(curr, 0));
    String s ="";
    s.length();
    new ArrayList<Integer>().size();
  }

  private static Node reverseInBlocks(Node root, int k) {
    if (root == null)
      return root;
    Node runner = root;
    for (int i = 0; i < k - 1; i++) {
      runner = runner.next;
      if (runner == null)
        return root;
    }
    Node nextElem = runner.next;
    runner.next = null;
    Node revHead = ReverseListRecursive.reverse(root);
    root.next = reverseInBlocks(nextElem, k);
    return revHead;
  }

}
