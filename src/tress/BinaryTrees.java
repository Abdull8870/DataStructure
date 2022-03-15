package tress;

public class BinaryTrees {
	private Node root;
	
	public void insert(int value) {
		
		if(root !=null) {
			
			root.insert(value);
			System.out.println("The root is +"+root.getValue());
		} else {
			root=new Node(value);
		}
	}
	
	public void delete(int value) {
		root=deleteNode(root,value);
		
	}
	
	public Node deleteNode(Node subTree,int value) {
		if(subTree==null) {
			return subTree;
		}
		System.out.println("subTree value"+subTree.getValue()+" delete value"+value);
		if(value<subTree.getValue()) {
		  subTree.setLeftChild(deleteNode(subTree.getLeftChild(),value));	
		} else if(value>subTree.getValue()) {
			subTree.setRightChild(deleteNode(subTree.getRightChild(), value));
		} else {
			//Case 1 and 2 only 1 leaf
			System.out.println(subTree.getValue());
			if(subTree.getLeftChild()==null) {
				return subTree.getRightChild();
			} else if(subTree.getRightChild()==null) {
				return subTree.getLeftChild();
			}
			
			subTree.setValue(subTree.getRightChild().min());
			subTree.setRightChild(deleteNode(subTree.getRightChild(), subTree.getValue()));
		}
		
		return subTree;
		
	}
	
	public void inorderTraversal() {
		if(root !=null) {
			root.inorderTraversal();
		}
	}
	
	public void max() {
		if(root !=null) {
			root.max();
		} else {
			System.out.println("Empty tree");
		}
	}
	
	public void min() {
		if(root !=null) {
			root.min();
		} else {
			System.out.println("Empty tree");
		}
	}
	
	public void displayRoot() {
		System.out.println("Root value :"+root.getValue());
	}

}
