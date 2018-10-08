package bTree;

/*
 * 
 * @Author Saquib Ali
 * 
 * @Description Construct a tree given its in order and pre order traversal string.
 * 
 * inOrder: 1 2 3 4 5 6 7 8 9 10 postOrder: 1 3 2 5 4 7 10 9 8 6
 * 
 */
public class ConstructBtree2 {
	static int i = 0;
	private static Node root;
	public static void main(String[] args) {
		int inOrderstr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int postOrder[] = { 1, 3, 2, 5, 4, 7, 10, 9, 8, 6 };
		i = postOrder.length - 1;
		root = buildTree(postOrder, inOrderstr, 0, inOrderstr.length - 1);
		printPostOrder(root);
	}

	private static Node buildTree(int[] postOrder, int[] inOrderstr, int start, int end) {
		Node root;
		if (start > end) {
			return null;
		}
		int iIn = search(inOrderstr, start, end, postOrder[i--]);
		root = new Node(inOrderstr[iIn]);
		if (start == end) {
			return root;
		}
		// iIn is index of inorder
		root.right = buildTree(postOrder, inOrderstr, iIn + 1, end);
		root.left = buildTree(postOrder, inOrderstr, start, iIn - 1);
		return root;
	}

	private static void printPostOrder(Node root2) {
		if (root2 != null) {

			printPostOrder(root2.left);
			printPostOrder(root2.right);
			System.out.print(root2.data + " , ");
		}

	}

	// searching value from post order in in order array

	private static int search(int[] inOrder, int start, int end, int value) {
		for (int i = start; i <= end; i++) {
			if (inOrder[i] == value)
				return i;
		}
		return 0;
	}

}
