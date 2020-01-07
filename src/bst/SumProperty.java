package bst;

class BST2 {
	Node root;

	public BST2(Node root) {
		this.root = root;
	}

	boolean isPropertyfollowed = true;

	public int printSumProperty(Node r) {
		if (r == null)
			return 0;
		int sum = 0;
		if (r.left != null)
			sum = sum + printSumProperty(r.left);
		if (r.right != null)
			sum = sum + printSumProperty(r.right);
		if (r.left == null && r.right == null)
			return r.data;
		if (r.data != sum)
			isPropertyfollowed = false;
		return sum;
	}
}

public class SumProperty {
	public static void main(String[] args) {
//			 1
		// 2 3
		// 4 5
		Node n = new Node(10);
		n.left = new Node(8);
		n.right = new Node(2);
		n.left.left = new Node(3);
		n.left.right = new Node(5);
		n.right.left = new Node(2);
		/*n.right.right = new Node(7);
		n.left.left.left = new Node(8);
		n.left.left.right = new Node(9);
		n.left.right.left = new Node(10);
		n.left.right.right = new Node(11);
		n.right.left.left = new Node(12);
		n.right.left.right = new Node(13);
		n.right.right.left = new Node(14);
		n.right.right.right = new Node(15);*/
		BST2 b = new BST2(n);
		b.printSumProperty(n);
		System.out.println(b.isPropertyfollowed);
	}
}
