package testing;

import stack.LinkedStack;
import stack.Stack;
import stack.StackInterface;

public class LinkedStackDriver {

	public static void main(String[] args) {
		StackInterface<Rectangle> arrayStack = new Stack<Rectangle>();
		StackInterface<Rectangle> linkedStack = new LinkedStack<Rectangle>();
		
		System.out.println("arrayStack emtpy? " + arrayStack.isEmpty());
		System.out.println("arrayStack emtpy? " + linkedStack.isEmpty());
		arrayStack.push(new Rectangle(1,2));
		arrayStack.push(new Rectangle(11,2));
		arrayStack.push(new Rectangle(12,2));
		linkedStack.push(new Rectangle(4,2));
		linkedStack.push(new Rectangle(14,2));
		linkedStack.push(new Rectangle(42,2));
		linkedStack.push(new Rectangle(6,2));
		linkedStack.push(new Rectangle(3,2));
		
		StackInterface stacks[] = {arrayStack, linkedStack};
		
		System.out.println("arrayStack size? " + arrayStack.size());
		System.out.println("linkedStack size? " + linkedStack.size());
		
		System.out.println("popping the top: " + linkedStack.pop());
		System.out.println("popping another four elements.  " );
		linkedStack.pop();
		linkedStack.pop();
		linkedStack.pop();
		linkedStack.pop();
		
		System.out.println("linkedStack size? " + linkedStack.size());
		System.out.println("linkedStack should throw an exception.");
		
		linkedStack.pop();

	}

}
