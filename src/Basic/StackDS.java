package Basic;

import java.util.Scanner;

public class StackDS {
	static int top = -1;
	static int size = 5;
	static int[] stack = new int [size];
	
	public static void pushElement(int[] stack, int num) {
		try {
			if(top==size -1) {
				System.out.println("Stack is Full !!!1.. You are not able to insert an element");
			}else {
				top++;
				//System.out.println("Enter an element :  ");
				stack[top]= num;
				System.out.printf(" \n %d Pushed sucessfully!!", num);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void popElement(int[] stack) {
		try {
			if(top==-1) {
				System.out.println("Stack Underflow....");
			}
			else {
				System.out.printf("\n %d is popped sucessfully!!", stack[top]);
				top--;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void display(int[] stack) {
		System.out.println();
		System.out.println(" Stack Elements are: ");
		if(top == -1) {
			System.out.println(" Stack is Empty!! ");
		}
		for(int i=top; i>=0; i--) {
			
			System.out.println(" "+ stack[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			int num, choice = 0;
			System.out.println();
			System.out.println("......Menu......");
			System.out.println("1. Push Element");
			System.out.println("2. Pop Element");
			System.out.println("3. Display Stack");
			System.out.println("4. Exit the operations");
			
			choice = sc.nextInt();
			switch(choice){
			case 1: System.out.println("Enter the element to insert ");
					num = sc.nextInt();
					pushElement(stack,num);
					break;
					
			case 2: popElement(stack);
					break;
			
			case 3: display(stack);
					break;
			
			case 4: System.out.println("Exiting.......");
					System.exit(0);
					break;
					
			default: System.out.println("Please enter valid Choice");
					
			}
		}
	}

}
