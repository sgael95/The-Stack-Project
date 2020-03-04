/**
 * 
 */
package stack;
import exception.*;
/**
 * @author czhang2
 * @param <T>
 *
 */
public class Stack<T> implements StackInterface<T>{
	private int top;
	private T[] stack;
	private final static int DEFAULT_SIZE = 2;
	
	//constructor
	public Stack(int size){
		top = 0;
		stack = (T[])(new Object[size]);
	}
	public Stack (){
		this(DEFAULT_SIZE);
	}

	@Override
	public void push(T e) {
		if (top == stack.length){
			expandCapacity();
		}
		stack[top] = e;
		top++;
		
	}
	private void expandCapacity(){
		T[] newStack = (T[])(new Object[stack.length * 2]);
		//copy element from old to new
		for (int i = 0; i < stack.length; i ++){
			newStack[i] = stack[i];
		}
		//changing pointer. 
		stack = newStack;
	}

	@Override
	public T pop()throws EmptyStackException {
		if (top == 0)
			throw new EmptyStackException();
		top--;
		T item = stack[top];
		stack[top] = null;
		return item;
	}

	@Override
	public T peek() throws EmptyStackException{
		if (top == 0)
			throw new EmptyStackException();
		T item = stack[top-1];
		return item;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public boolean isEmpty() {
		return top==0;
	}
	

}