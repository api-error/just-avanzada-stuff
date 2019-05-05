package pilasYColas;

public class ColaEstatica implements Cola {
	
	private Object[] cola;
	private int posicionInicial;
	private int posicionFinal;
	private int cantidadMaxima;
	
	public ColaEstatica() {
		this.cantidadMaxima = 10;
		this.cola = new Object[cantidadMaxima];
		this.posicionInicial = 0;
		this.posicionFinal = 0;
	}
	
	@Override
	public boolean offer(Object obj) {
		if(posicionFinal == cantidadMaxima)
			return false;
		cola[posicionFinal] = obj;
		posicionFinal++;
		return false;
	}

	@Override
	public Object poll() {
		
		Object obj = cola[posicionFinal-1];
		acomodarCola();
		return obj;
	}

	@Override
	public Object peek() {
		if(posicionFinal == cantidadMaxima)
			return null;
		
		return cola[posicionFinal-1];
	}

	@Override
	public boolean isEmpty() {
		
		return posicionFinal == posicionInicial;
	}

	@Override
	public void empty() {
		for(int i = posicionFinal ; i >= 0 ; i--) {
			cola[i] = null;
		}
		posicionFinal = posicionInicial;
	}
	
	public void acomodarCola() {
		posicionFinal--;
		for(int i = posicionInicial, siguiente = i+1; i<= posicionFinal; i++, siguiente++)
			cola[i] = cola[siguiente];
	}
}
