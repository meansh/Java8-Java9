package com.tree;


class Node {
	int key;
	Node left, right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
public class BinaryTree {
	
	static Node root;
	
	BinaryTree() {root = null;}
	
	static void printInorder(Node node) {
		if(node == null)
			return;
		
		printInorder(node.left);
		System.out.println(node.key + " ");
		printInorder(node.right);
	}
	
	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree();
	        root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        
	        printInorder(root);
	}
}
