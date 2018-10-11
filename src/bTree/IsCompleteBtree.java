package bTree;

/*
 * 
 * @Author Saquib Ali
 * 
 * @Description Check if a binary Tree is complete or not.
 * 
 */
public class IsCompleteBtree {

  public static void main(String[] args) {
    CompleteBtree b1 = new CompleteBtree();
    int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 21};
    Node root = b1.createCompleteBtree(inOrderstr, 0);
    int numOfNodes = numOfNodes(root);
    System.out.println(isCBTree(root, 0, numOfNodes));
  }

  private static Boolean isCBTree(Node root, int start, int numOfNodes) {
    if (root == null) {
      return true;
    }
    if (start > numOfNodes) {
      return false;
    }
    return (isCBTree(root.left, 2 * start + 1, numOfNodes)
        && isCBTree(root.right, 2 * start + 2, numOfNodes));
  }

  private static int numOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    return 1 + numOfNodes(root.left) + numOfNodes(root.right);
  }

}
