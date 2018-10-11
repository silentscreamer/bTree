package bTree;

/*
 * 
 * @Author Saquib Ali
 * 
 * @Description Construct a Complete Binary tree.
 * 
 */
public class CompleteBtree {

  public static void main(String[] args) {
    int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Node root = createCompleteBtree(inOrderstr, 0);
  }

  private static Node createCompleteBtree(int[] inOrderstr, int start) {
    int size = inOrderstr.length;
    Node curr = new Node(inOrderstr[start]);
    int left = 2 * start + 1;
    int right = 2 * start + 2;
    if (left < size) {
      curr.left = createCompleteBtree(inOrderstr, left);
    }
    if (right < size) {
      curr.right = createCompleteBtree(inOrderstr, right);
    }
    return curr;
  }
}
