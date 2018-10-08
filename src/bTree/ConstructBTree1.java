package bTree;
/*
 * 
 * @Author Saquib Ali
 * 
 * @Description Construct a tree given its in order and pre order traversal string.
 * 
 * inOrder: 1 2 3 4 5 6 7 8 9 10 preOrder: 6 4 2 1 3 5 8 7 9 10
 * 
 */

public class ConstructBTree1 {
 
  static int preIndex = 0;
  private static Node root;

  public static void main(String[] args) {

    int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int preOrder[] = {6, 4, 2, 1, 4, 5, 8, 7, 9, 10};
    root = buildTree(preOrder, inOrderstr,  0, inOrderstr.length - 1);
    printPreOrder(root);
  }

  private static void printPreOrder(Node root2) {
    if (root2 != null) {
      System.out.print(root2.data + " , ");
      printPreOrder(root2.left);
      printPreOrder(root2.right);
    }

  }

  private static Node buildTree(int[] preOrder, int[] inOrderstr, int start, int end) {
    int mid = 0;
    if (start > end) {
      return null;
    }
    if (start == end)
      return root;
    if(preIndex<preOrder.length) {
      Node root = new Node(preOrder[preIndex++]);
      mid = search(root.data, start, end, inOrderstr);
      root.left = buildTree(preOrder, inOrderstr, start, mid - 1);
      root.right = buildTree(preOrder, inOrderstr, mid + 1, end);
    }
   
   


    return root;
  }

  static int search(int value, int start, int end, int[] inOrderstr) {

    for (int i = start; i <= end; i++) {
      if (value == inOrderstr[i]) {
        return i;
      }
    }
    return 0;
  }

}
