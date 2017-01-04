package List;

public class MergeLinkLists {

	static Node head1=null;
	static Node head2=null;
	static Node node=null; 

	public static void main(String[] args) {
		head1=new Node(3);
		head2=new Node(1);
		node=new Node(5);
		head1.next=node;
		node=new Node(2);
		head2.next=node;
		
		System.out.println(head1.data);
		System.out.println(head1.next.data);
		
		System.out.println(head2.data);
		System.out.println(head2.next.data);
		
		//merge them
		
		
		
		
		
	}



}





///*
//Merge two linked lists 
//head pointer input could be NULL as well for empty list
//Node is defined as 
//class Node {
//   int data;
//   Node next;
//}
//*/
//
//Node MergeLists(Node headA, Node headB) {
//   // This is a "method-only" submission. 
//   // You only need to complete this method 
//  Node node1=null;
//  Node node2=null;
//  if(headA.data>headB.data){
//      node1=headB;
//      headB=headA;    
//      headA=node1;
//  node1=null;}
//      
//  if(headA==null)
//      return headB;
//  else if(headB==null)
//      return headA;
//  else{
//      //start merging 
//      node1=headA;
//      
//      while(node1!=null){
//          node2=headB;    
//          while(node1.data<node2.data && node2.next!=null){
//                node2=node2.next;
//          }
//          if(node1.data<node2.data)
//              continue;
//          //insert node2
//          if(node2.next==null ){
//              node2.next=node1;
//              return headB;   
//          }
//          else{
//          node1.next=node2.next;
//          node2.next=node1;
//          }
//          node1=node1.next;
//      }
//      return headB;
//  }
//}