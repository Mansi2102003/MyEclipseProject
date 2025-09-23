package Basic;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null ;
	}
}

class StackLinkedList{
	private  Node top = null;
	
	public void push(int val) {
		Node newNode = new Node(val);
		newNode.next= top;
		top = newNode;
		System.out.println("Node element sucessfully ");
	}
	
	public void pop() {
		if(top == null) {
			System.out.println("Stack is Empty ");
		}else {
			System.out.println("Element deleted sucessfully, Deleted element: "+ top.data);
			top = top.next;
		}
	}
}
public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		StackLinkedList stack = new StackLinkedList();
		stack.push(11);
		stack.pop();
	}

}
