package DS.LinkedList;

public class Node {
  public Node(int i) {
    this.value = i;
  }

  public Node() {

  }

  public Node next;
  public int value;

  public void addNode(int i) {
    Node runner = this;
    while (runner.next != null) {
      runner = runner.next;
    }
    runner.next = new Node(i);
  }
}
