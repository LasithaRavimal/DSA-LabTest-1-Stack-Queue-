package test1;


public class Stack {

	private char[] array;
	private int maxSize;
	private int top;
	
	public Stack(int s) {
		maxSize = s;
		array = new char [maxSize];
		top = -1;
	}
	
	public boolean isFull(){
		if(top == maxSize-1) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void push(char a) {
		if(isFull()) 
			System.out.println("Stack is Full");
		else {
			array[++top] = a;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return '-';
		}
		else {
			return array[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return '-';
		}
		else {
			return array[top];
		}
	}
}