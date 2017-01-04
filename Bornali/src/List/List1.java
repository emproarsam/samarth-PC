package List;

import java.util.*;

public class List1 {

	
	public List1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Node> list=new LinkedList<Node>();
		Node head =new Node(101);
		Node n1=new Node(10);
		Node n2=new Node(410);
		list.addFirst(head);
		list.add(n1);
		list.add(n1);
		list.add(n1);
		list.add(n1);
		list.add(n1);
		System.out.println("peek "+list.peek().data);
		System.out.println("poll "+list.poll().data);
		System.out.println("pop "+list.pop().data);
		list.push(n2);
		list.remove(n1);
		Node[] arr=(Node[]) list.toArray();
		
		Iterator<Node> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().data);
		}
		System.out.println("First "+list.getFirst().data);
		System.out.println("Last "+list.getLast().data);
		System.out.println("Last "+list.lastIndexOf(n1));
		
		//System.out.println(list.get(0).x);
		//System.out.println(list.get(1).x);
		
		
	}

}


