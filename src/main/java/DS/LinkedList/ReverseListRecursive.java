package DS.LinkedList;

public class ReverseListRecursive {
  public static void run() {
    Node curr = new Node(1);
    curr.addNode(2);
    curr.addNode(3);
    NodeUtils.printList(curr);
    NodeUtils.printList(reverse(curr));
  }

  public static Node reverse(Node curr) {
    if (curr == null)
      return null;
    if (curr.next == null)
      return curr;
    Node nextElem = curr.next;
    curr.next = null;
    Node revHead = reverse(nextElem);
    nextElem.next = curr;
    return revHead;
  }

}
