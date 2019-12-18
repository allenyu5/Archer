package per.archer.tree;

public class TreeTest {
	
	public static void main(String[] args) {
		System.out.println("test for tree traverse");
		BinaryTree binaryTree = new BinaryTree();
		System.out.println("Traverse tree by pre order:");
		binaryTree.preOrderTraverse(binaryTree.getRootTreeNode());
		System.out.println("\nTraverse tree by in order:");
		binaryTree.inOrderTraverse(binaryTree.getRootTreeNode());
		System.out.println("\nTraverse tree by post order:");
		binaryTree.postOrderTraverse(binaryTree.getRootTreeNode());
	}

}
