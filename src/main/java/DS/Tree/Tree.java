package DS.Tree;

public class Tree {
  Node root;

  public static void main(String[] args) {
    new Tree().run();
  }

  private void run() {
    Node n1 = new Node(4);
    n1.left = new Node(9);
    Node n2 = new Node(5);
    n2.right = new Node(8);
    Node n = new Node(2);
    n.left = n1;
    n.right = n2;

    Node m = new Node(3);
    m.left = new Node(6);
    m.right = new Node(7);

    root = new Node(1);
    root.left = n;
    root.right = m;

    Traversal traversal = new InOrderTraversal();
    traversal.recursive(root);
    System.out.println();
    traversal.iterative(root);
  }
}
