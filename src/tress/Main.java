package tress;

public class Main {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
        BinaryTrees tree=new BinaryTrees();
        tree.insert(30);

        tree.insert(31);

        tree.insert(32);
        tree.insert(45);
        tree.insert(34);
        tree.insert(35);
        tree.insert(20);
        tree.insert(37);
        tree.insert(12);
        tree.insert(14);
        tree.insert(19);
        tree.inorderTraversal();
        tree.max();
        tree.min();
        tree.delete(19);
        tree.displayRoot();
        tree.inorderTraversal();
	}

}
