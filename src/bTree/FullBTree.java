package bTree;
/*
 * 
 * @Author Saquib Ali
 * 
 * @Description If Full Binary tree.
 * 
 */
public class FullBTree {

	public static void main(String[] args) {
		int inOrderstr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		CompleteBtree c1 = new CompleteBtree();
		Node root = c1.createCompleteBtree(inOrderstr, 0);
		System.out.println(fullBTree(root));
	}

	private static Boolean fullBTree(Node root) {

		if (root == null)
			return true;
		if (root.left == null && root.right == null) {
			return true;
		}
		if (root.left != null && root.right != null) {
			return fullBTree(root.left) && fullBTree(root.right);
		}
		return false;
	}
}
