package exception;

public class EmptyStackException extends RuntimeException{
	public EmptyStackException(){
		super("The stack is empty. No more items to pop. ");
	}
}
