package pilasYColas;

public class PilaDinamica implements Pila {

	private Object[] pila;
	private int cantidadMaxima;
	private int ultimoValor;
	
	
	public PilaDinamica() {
		pila = new Object[1];
		this.ultimoValor = 0;
		this.cantidadMaxima = 1;
	}
	
	
	@Override
	public boolean push(Object obj) {
		if(ultimoValor == cantidadMaxima)
			AgrandarPila();
		
		pila[ultimoValor] = obj;
		ultimoValor++;
		return true;
	}

	@Override
	public Object pop() {
		if(ultimoValor == 0)
			return null;
		ultimoValor--;
		Object obj = pila[ultimoValor];
		pila[ultimoValor] = null;
		return obj;
	}

	@Override
	public Object peek() {
		if(ultimoValor == 0)
			return null;
		return pila[ultimoValor-1];
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = ultimoValor == 0 && pila[0] == null ? true : false;
		
		return isEmpty;
	}

	@Override
	public void empty() {
		for(int i = ultimoValor-1 ; i >= 0 ; i--) {
			pila[i] = null;
		}
		ultimoValor = 0;

	}
	private void AgrandarPila() {
		Object[] pilaNueva = new Object[++cantidadMaxima];
		for(int i = 0 ; i<cantidadMaxima-1; i++)
			pilaNueva[i] = pila[i];
		pila = pilaNueva;
	}
}
