package com.tree.node;

public class TreeNode {
	
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	
	public TreeNode() {
		// TODO Auto-generated constructor stub
		data = Integer.MIN_VALUE;
		left = null;
		right = null;
	}
	
	public TreeNode(int data) {
		this.data = data;
		left  = null;
		right = null;
	}


	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
