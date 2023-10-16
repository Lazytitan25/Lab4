package lab4;

public class BTPrinting extends BinaryTree
{
	// POST ORDER METHOD //
	// This method prints a given binary tree with post-order traversal
	public void PostOrder(Node root)
	{
		// If the local root is null, return, as it is a leaf node
		if(root == null)
		{
			return;
		}
		
		// Call PostOrder on the left node, then on the right node, and then print the
		// data fron the local root
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.println(root.data);
	}
	
	// PRINT RIGHT METHOD //
	// This method traverses as deeply down the right branch of a given tree as it can,
	// and then prints the result from the deepest back to the root
	public void PrintRight(Node root)
	{
		// If the root is null, return
		if(root == null)
		{
			return;
		}
		
		// Call print right on the right node of the tree, and then print out the data
		// of the local root
		PrintRight(root.right);
		System.out.println(root.data);
	}
}
