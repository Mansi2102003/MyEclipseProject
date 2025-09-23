package Basic;

class Node{
	int data;
	Node ref;
	
	Node(int data){
		this.data = data;
		this.ref = null ;
	}
}

class StackLinkedList{
	private  Node top = null;
	
	public void push(int val) {
		Node newNode = new Node(val);
		newNode.ref = top;
		top = newNode;
		System.out.println("Node element sucessfully ");
	}
}
public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		StackLinkedList stack = new StackLinkedList();
		stack.push(11);
	}

}
