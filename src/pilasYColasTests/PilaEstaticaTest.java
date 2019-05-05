package pilasYColasTests;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pilasYColas.PilaEstatica;

public class PilaEstaticaTest {
	
	public PilaEstatica pila;
	
	@Before
	public void SetUp() {
		pila = new PilaEstatica(10);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void CreaPila() {
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void InsertaElemento() {
		int numero = 1;
		pila.push(numero);
		
		Assert.assertEquals(false, pila.isEmpty());
		
	}
	
	@Test
	public void InsertaElementoYLoRecupera() {
		int numero = 1;
		pila.push(numero);
		int numeroRecuperado = (int)pila.pop();
		Assert.assertEquals(numero, numeroRecuperado);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void InsertaHastaElTope() {
		int numero = 0;
		while(numero <= 9)
			pila.push(numero++);
		
		Assert.assertEquals(false, pila.push(numero));
	}
	
	public void MuestraUltimoElementoInsertado() {
		int numero = 0;
		pila.push(numero);
		int numeroRecuperado = (int)pila.peek();
		Assert.assertEquals(numero, numeroRecuperado);
		Assert.assertEquals(false, pila.isEmpty());
		
	}
	
	@Test
	public void VaciaLaPila() {
		int numero = 0;
		while(numero <= 9)
			pila.push(numero++);
		pila.empty();
		Assert.assertEquals(true, pila.isEmpty());
	}
}
