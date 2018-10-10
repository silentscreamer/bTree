package bTree;

/*
 * 
 * @Author Saquib Ali
 * 
 * @Description BF traversal using system stack.
 * 
 */
public class BredthFirstTraversal {
  public static void main(String[] args) {
    ConstructBTree1 b1 = new ConstructBTree1();
    int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int preOrder[] = {6, 4, 2, 1, 3, 5, 8, 7, 9, 10, 11};
    Node root = b1.buildTree(preOrder, inOrderstr, 0, inOrderstr.length - 1);
    int lev = heightOfTree(root);
    for (int d = 1; d <= lev; d++) {
      bredthFirst(root, d);
    }
  }

  private static int heightOfTree(Node root) {
    if (root == null) {
      return 0;
    } else {
      int countl = heightOfTree(root.left);
      int countr = heightOfTree(root.right);
      if (countl > countr) {
        return countl + 1;
      } else {
        return countr + 1;
      }
    }
  }

  private static void bredthFirst(Node root, int level) {
    if (root == null) {
      return;
    }
    if (level == 1) {
      System.out.println(root.data);
    }
    if (level > 1) {
      bredthFirst(root.left, level - 1);
      bredthFirst(root.right, level - 1);
    }
  }
}
