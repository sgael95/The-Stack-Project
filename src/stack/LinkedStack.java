package stack;

import exception.*;

public class LinkedStack<T> implements StackInterface<T>{

	private LinearNode<T> top;
	private int count;
	
	public LinkedStack(){
		top = null;
		count = 0;
	}
	public LinkedStack(T element){
		LinearNode<T> node = new LinearNode<T>(element);
		top = node;
		count=1;
	}
	
	@Override
	public void push(T e) {
		//When stack is empty
		LinearNode<T> node = new LinearNode<T>(e);
		if(count == 0){
			top = node;
			count=1;
		}//When stack is not empty 
		else {
			node.setNext(top);
			top = node;
			count++;
		}
	}

	@Override
	public T pop() throws EmptyStackException {
		if (count == 0){
			throw new EmptyStackException();
		}
		T result = top.getElement();
		top.setNext(top.getNext());
		//top=top.getNext();
		count--;
		return result;
	}

	@Override
	public T peek() throws EmptyStackException{
		if (count == 0){
			throw new EmptyStackException();
		}
		T result = top.getElement();
		return result;
		//return top.getElement();
	}
	@Override
	public int size(){
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}
	

}
