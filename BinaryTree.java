package com.tree.node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree(){
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		TreeNode eighth = new TreeNode(8);
		TreeNode ninth = new TreeNode(9);
		TreeNode tenth = new TreeNode(10);
		
		
		root= first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		second.right=fifth;
		
		third.left=sixth;
		third.right=seventh;
		
		fourth.left=eighth;
		fourth.right=ninth;
		
		sixth.left=tenth;
		}
	
/*PREORDER RECURSIVE
 * 	public void preOrder(TreeNode root){
		if(root==null){
			return;
		}
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}*/

	
	//PREORDER ITERATIVE
/*	public void preOrder(){
		if(root==null){
			return;
	}
		Stack<TreeNode> stack= new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode temp= stack.pop();
			System.out.println(temp.data + " ");
			if(temp.right != null){
				stack.push(temp.right);
			}
			if(temp.left!=null){
				stack.push(temp.left);
			}
		}
		
		
	}
	*/
	
	//LEVEL ORDER TRAVERSAL
	
	public void levelOrder(){
		if(root==null){
		return;
	}
	Queue<TreeNode> queue= new LinkedList<>();
	queue.offer(root);
	
	while(!queue.isEmpty()){
		TreeNode temp=queue.poll();
		System.out.println(temp.data + " ");
		if(temp.left != null){
			queue.offer(temp.left);
		}
		
		if(temp.right != null){
			queue.offer(temp.right);
		}
	}
	}
	
	
	
	public static void main (String[] args){
		BinaryTree bt= new BinaryTree();
		bt.createBinaryTree();
		bt.levelOrder();
	}

}
