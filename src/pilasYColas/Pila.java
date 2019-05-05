package pilasYColas;

public interface Pila {
	public boolean push(Object obj);
	public Object pop();
	public Object peek();
	public boolean isEmpty();
	public void empty();
}
