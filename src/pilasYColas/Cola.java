package pilasYColas;

public interface Cola {
	public boolean offer(Object obj);
	public Object poll();
	public Object peek();
	public boolean isEmpty();
	public void empty();
}
