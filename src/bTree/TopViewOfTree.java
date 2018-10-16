package bTree;
/*
 * 
 * @Author Saquib Ali
 * 
 * @Description Top View Of Tree up to n level.
 * 
 */
public class TopViewOfTree {
public static void main(String[] args) {
  int inOrderstr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  CompleteBtree cbt = new CompleteBtree();
  Node root = cbt.createCompleteBtree(inOrderstr, 0);
  int level = 3;
  for(int d =1;d<=level;d++) {
    printTopViewUptoLevel(root,d);
  }
}

private static void printTopViewUptoLevel(Node root, int level) {
  if(root ==null) {
    return;
  }
  if(level==1) {
    System.out.println(root.data);
  }
  if(level>1) {
    printTopViewUptoLevel(root.left,level-1);
    printTopViewUptoLevel(root.right,level-1);
  }
}
}
