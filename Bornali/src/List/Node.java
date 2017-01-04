package List;

public class Node {

	
	public int data;
	public Node next=null;
	
	public Node(int x, Node n) {
		// TODO Auto-generated constructor stub
		this.data=x;
		this.next=new Node(this.data,n);
	}

	public Node(int x) {
		// TODO Auto-generated constructor stub
		this.data=x;
	}
}
