package pilasYColas;

public class PilaEstatica implements Pila {

	private Object[] pila;
	private int cantidadMaxima = 10;
	private int ultimoValor;
	
	public PilaEstatica() {
		this.pila = new Object[cantidadMaxima];
		this.ultimoValor = 0;
	}
	
	@Override
	public boolean push(Object obj) {
		if(ultimoValor == cantidadMaxima -1)
			return false;
		
		pila[ultimoValor] = obj;
		ultimoValor++;
		return true;
	}

	@Override
	public Object pop() {
		if(ultimoValor == 0)
			return null;
		
		Object obj = pila[ultimoValor--];
		pila[ultimoValor] = null;
		return obj;
	}

	@Override
	public Object peek() {
		
		return pila[ultimoValor-1];
	}

	@Override
	public boolean isEmpty() {
		
		boolean isEmpty = ultimoValor == 0 && pila[0] == null ? true : false;
		
		return isEmpty;
	}

	@Override
	public void empty() {
		for(int i = ultimoValor ; i >= 0 ; i--) {
			pila[i] = null;
		}
		ultimoValor = 0;
	}

}
