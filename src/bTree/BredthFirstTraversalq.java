package bTree;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 
 * @Author Saquib Ali
 * 
 * @Description BF traversal using queue.
 * 
 */
public class BredthFirstTraversalq {
  public static void main(String[] args) {
    ConstructBTree1 b1 = new ConstructBTree1();
    int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int preOrder[] = {6, 4, 2, 1, 3, 5, 8, 7, 9, 10, 11};
    Node root = b1.buildTree(preOrder, inOrderstr, 0, inOrderstr.length - 1);
    bredthFirst(root);
  }
  private static void bredthFirst(Node root) {
    Node temp;
    Queue<Node> que = new ArrayDeque<Node>();
    if(root!=null) {
      que.add(root);
    }
    while(!que.isEmpty()) {
     temp = que.remove();
     System.out.println(temp.data);
     if(temp.left!=null)
     que.add(temp.left);
     if(temp.right!=null)
     que.add(temp.right);
    }
  }
}
