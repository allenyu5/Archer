package per.archer.tree;

public class BinaryTree {
	
	private TreeNode rootTreeNode;
	
	public TreeNode getRootTreeNode() {
		return rootTreeNode;
	}

	public void setRootTreeNode(TreeNode rootTreeNode) {
		this.rootTreeNode = rootTreeNode;
	}
	
	BinaryTree() {
		TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.setLeftTreeNode(b);
        a.setRighTreeNode(c);
        b.setRighTreeNode(d);
        c.setLeftTreeNode(e);
        c.setRighTreeNode(f);
        f.setLeftTreeNode(g);
        this.setRootTreeNode(a);
	}
	
	//  recursive function
	public void preOrderTraverse(TreeNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.getValue() + " ");
		preOrderTraverse(node.getLeftTreeNode());
		preOrderTraverse(node.getRighTreeNode());
	}
	
	public void inOrderTraverse(TreeNode node) {
		if(node==null) {
			return;
		}
		inOrderTraverse(node.getLeftTreeNode());
		System.out.print(node.getValue() + " ");
		inOrderTraverse(node.getRighTreeNode());
	}
	
	public void postOrderTraverse(TreeNode node) {
		if(node==null) {
			return;
		}
		postOrderTraverse(node.getLeftTreeNode());
		postOrderTraverse(node.getRighTreeNode());
		System.out.print(node.getValue() + " ");
	}


	
	

}
