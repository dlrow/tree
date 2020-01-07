package bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}

class BST {
	Node root;

	public BST(Node root) {
		this.root = root;
	}

	public void printLevelOrder() {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			if (curr == null) {
				if (!q.isEmpty())
					q.add(null);
				System.out.println();
				continue;
			}
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
			System.out.print(curr.data + "  ");
		}
	}

	public void printLevelOrderInSpiralForm() {
		Queue<Node> q = new LinkedList<>();
		Stack<Node> s = new Stack<>();
		q.add(root);
		int dir = 1;
		while (!q.isEmpty() && s.isEmpty()) {
			while (!q.isEmpty()) {
				Node curr = q.poll();
				s.add(curr);
			}
			while (!s.isEmpty()) {
				Node currFromStack = s.pop();
				System.out.print(currFromStack.data + "  ");
				if (dir % 2 == 0) {
					if (currFromStack.left != null)
						q.add(currFromStack.left);
					if (currFromStack.right != null)
						q.add(currFromStack.right);
				} else {
					if (currFromStack.right != null)
						q.add(currFromStack.right);
					if (currFromStack.left != null)
						q.add(currFromStack.left);
				}

			}
			dir++;
		}
	}
}

public class LevelOrderLineByLine {
	public static void main(String[] args) {
//			 1
		// 2 3
		// 4 5
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		n.left.left.left = new Node(8);
		n.left.left.right = new Node(9);
		n.left.right.left = new Node(10);
		n.left.right.right = new Node(11);
		n.right.left.left = new Node(12);
		n.right.left.right = new Node(13);
		n.right.right.left = new Node(14);
		n.right.right.right = new Node(15);
		BST b = new BST(n);
		b.printLevelOrder();
		System.out.println("\n");
		b.printLevelOrderInSpiralForm();
	}
}
