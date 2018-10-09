package bTree;
/*
 * 
 * @Author Saquib Ali
 * 
 * @Description Delete a node.
 * 
 */
public class DeleteNode {
  static int val = 0;

  public static void main(String[] args) {
    ConstructBTree1 b1 = new ConstructBTree1();
    int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int preOrder[] = {6, 4, 2, 1, 3, 5, 8, 7, 9, 10, 11};
    Node root = b1.buildTree(preOrder, inOrderstr, 0, inOrderstr.length - 1);
    int value = 9;
    root = deleteNode(root, value);
    b1.printPreOrder(root);
  }
  
  private static Node deleteNode(Node root, int value) {
    Node temp = null;
    if (root != null) {
      if (root.data == value) {
        if (root.left == null && root.right == null) {
          return null;
        }
        if (root.left == null) {
          temp = root.right;
          return temp;
        }
        if (root.right == null) {
          temp = root.left;
          return temp;
        }
        int minVal = findMin(root.right);
        root.data = minVal;
        root.right = deleteNode(root.right, minVal);
      } else {
        if (root.data > value) {
          root.left = deleteNode(root.left, value);
        } else {
          root.right = deleteNode(root.right, value);
        }
      }
    }
    return root;
  }
  private static int findMin(Node right) {
    if (right == null) {
      return 0;
    }
    if (right.left == null && right.right == null) {
      return right.data;
    }
    while (right.left != null) {
      val = right.left.data;
      right = right.left;
    }
    return val;
  }
}
