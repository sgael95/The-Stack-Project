package stack;

public class LinearNode<T> {
	private T element;
	private LinearNode<T> next;
	
	public LinearNode(){
		element = null;
		next = null;
	}
	public LinearNode(T element){
		this.element = element;
		next = null;
	}
	public void setElement(T element){this.element = element;}
	public void setNext(LinearNode<T> next){this.next = next;}
	public T getElement(){return element;}
	public LinearNode<T> getNext(){return next;}
	public String toString(){return element + " ";}

}
