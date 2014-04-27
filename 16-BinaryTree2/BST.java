public class BST {
    public Node root;

    public BST() {
        root = null;
    }
	
	public void insert(int y){
		Node x = new Node(y);
		if (root == null){
			root = x;
			return;
		}
		Node current = root;
		boolean done = false;
		while (!done){
			if (x.getData() > current.getData()){
				if (current.getRight() == null || x.getData() < current.getRight().getData()){
					if (current.getRight() == null) {
							current.setRight(x);
							done = true;
						}
					else{
						x.setRight(current.getRight());
						current.setRight(x);
						done = true;
					}
				}
				else{
					current = current.getRight();
				}
			}
			else{
				if (current.getLeft() == null || x.getData() < current.getLeft().getData()){
					if (current.getLeft() == null) {
						current.setLeft(x);
						done = true;
					}
					else{
						x.setLeft(current.getLeft());
						current.setLeft(x);
						done = true;
					}
				}
				else{
					current = current.getLeft();
				}
			}
		}
	}
	
	public Node search(int x){
		Node current = root;
		if (root.getData() == x)
			return root;
		while ((current.getRight() != null && current.getLeft() == null) && current.getData() != x){
			if (x < current.getData())
				current = current.getLeft();
			else
				current = current.getRight();
		}
		if (current.getRight() == null && current.getLeft() == null && current.getData() != x)
			return null;
		else
			return current;
	}
	
	public Node search2(Node c, int x){
		if ((c.getRight() == null && c.getLeft() == null) && c.getData() != x)
			return null;
		else if (c.getData() == x)
			return c;
		else if (c.getData() > x){
			if (c.getLeft() == null)
				return null;
			else
				return search2(c.getLeft(), x);
		}
		else{
			if (c.getRight() == null)
				return null;
			else 
				return search2(c.getRight(), x);
		}
	}
}
	
			
				
			
			