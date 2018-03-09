package DS.LinkedList;

public class NodeUtils {
  public static void printList(Node head){
    String s = "";
    while (head != null) {
      s += head.value;
      s += " ";
      head = head.next;
    }
    System.out.println(s);
  }
}
