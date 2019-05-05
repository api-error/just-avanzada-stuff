package pilasYColasTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

import pilasYColas.PilaDinamica;
import pilasYColas.PilaEstatica;

public class PilaDinamicaTest {

	public PilaDinamica pila;
	
	@Before
	public void SetUp() {
		pila = new PilaDinamica();
	}
	
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
	
	@Test
	public void LaPilaSeAgrandaConCadaIngreso() {
		int numero = 0;
		while(numero <= 100)
			pila.push(numero++);
		
		Assert.assertEquals(true, pila.push(numero));
	}
	
	@Test
	public void MuestraUltimoElementoInsertado() {
		int numero = 0;
		pila.push(numero);
		int numeroRecuperado = (int)pila.peek();
		Assert.assertEquals(numero, numeroRecuperado);
		Assert.assertEquals(false, pila.isEmpty());
		
	}
	
	@Test
	public void SacaElUltimoElementoYVAciaLaPila() {
		int numero = 0;
		pila.push(numero);
		int numeroRecuperado = (int)pila.pop();
		Assert.assertEquals(numero, numeroRecuperado);
		Assert.assertEquals(true, pila.isEmpty());
		
	}
	
	@Test
	public void VaciaLaPila() {
		int numero = 0;
		while(numero <= 9) 
			pila.push(numero++);
		pila.empty();
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void LLenarLaPilaYRecuperarTodosLosElementos() {
		int numero = 0;
		int numeroEsperado = 9;
		List<Integer> ListaEsperada = new ArrayList<Integer>();
		List<Integer> ListaRecibida = new ArrayList<Integer>();
		while(numeroEsperado >= 0)
			ListaEsperada.add(numeroEsperado--);
		while(numero <= 9) 
			pila.push(numero++);
		while(!pila.isEmpty())
			ListaRecibida.add((int)pila.pop());
		
		Assert.assertArrayEquals(ListaEsperada.toArray(), ListaRecibida.toArray());
	}
	
	@Test
	public void LaPilaEstaVacia() {
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void LaPilaNoEstaVacia() {
		pila.push(2);
		Assert.assertEquals(false, pila.isEmpty());
	}
	
	@Test
	public void PeekConPilaVacia() {
		
		Assert.assertEquals(null, pila.peek());
		
	}
	
	@Test
	public void RecuperarElementoDePilaVacia() {
		
		Assert.assertEquals(null, pila.pop());
		
	}
}
