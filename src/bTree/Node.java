package bTree;

/*
 * 
 * @Author Saquib Ali
 * 
 * @Description Basic node class
 * 
 */
public class Node {

  int data;
  Node left;
  Node right;

  Node(int data){
    this.data = data;
    left = right = null;
  }
}
