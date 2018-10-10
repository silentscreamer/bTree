package bTree;
/*
 * 
 * @Author Saquib Ali
 * 
 * @Description DF traversal using stack.
 * 
 */
import java.util.Stack;

public class DepthFirstSearch {

  public static void main(String[] args) {
    ConstructBTree1 b1 = new ConstructBTree1();
    int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int preOrder[] = {6, 4, 2, 1, 3, 5, 8, 7, 9, 10, 11};
    Node root = b1.buildTree(preOrder, inOrderstr, 0, inOrderstr.length - 1);
    depthFirst(root);
  }

  public static void depthFirst(Node root) {
    Stack<Node> stk = new Stack<Node>();
    Node temp;
    if (root != null) {
     stk.push(root);
    }
    while(!stk.isEmpty()) {
      temp = stk.pop();
      System.out.println(temp.data);
      if(temp.right!=null) {
        stk.push(temp.right);
      }
      if(temp.left!=null) {
        stk.push(temp.left);
      }
    }
   
  }

}
