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
		System.out.println(newNode.next);
		top = newNode;
		System.out.println(top);
		System.out.println("Node element sucessfully " +val);
	}
	
	public void pop() {
		if(top == null) {
			System.out.println("Stack is Empty ");
		}else {
			System.out.println("Element deleted sucessfully, Deleted element: "+ top.data);
			top = top.next;
		}
	}
	
	public void displayStack() {
		if(top == null) {
			System.out.println("Stack is Empty ");
		}else {
			Node temp = top;
			System.out.println("Stack Elements are: ");
			while(top!= null) {
				System.out.println(temp.data + "  ");
			}
			System.out.println("Stack is Empty");
		}
	}
}
public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		StackLinkedList stack = new StackLinkedList();
		stack.push(11);
		stack.pop();
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.pop();
	}

}
