package per.archer.tree;

public class TreeNode {
	private NodeData data;
	private TreeNode leftTreeNode;
	private TreeNode righTreeNode;
	private int value;
	
	public TreeNode(int value) {
		this.value = value;
	}

	public NodeData getData() {
		return data;
	}

	public void setData(NodeData data) {
		this.data = data;
	}

	public TreeNode getLeftTreeNode() {
		return leftTreeNode;
	}

	public void setLeftTreeNode(TreeNode leftTreeNode) {
		this.leftTreeNode = leftTreeNode;
	}

	public TreeNode getRighTreeNode() {
		return righTreeNode;
	}

	public void setRighTreeNode(TreeNode righTreeNode) {
		this.righTreeNode = righTreeNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class NodeData {
	private int nodeNumber;
	private Object nodeObject;

	public int getNodeNumber() {
		return nodeNumber;
	}

	public void setNodeNumber(int nodeNumber) {
		this.nodeNumber = nodeNumber;
	}

	public Object getNodeObject() {
		return nodeObject;
	}

	public void setNodeObject(Object nodeObject) {
		this.nodeObject = nodeObject;
	}

}
