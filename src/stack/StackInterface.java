package stack;

public interface StackInterface<T> {
	
	public void push (T e);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public int size();

}
