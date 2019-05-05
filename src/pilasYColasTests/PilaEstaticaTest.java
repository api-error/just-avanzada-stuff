package pilasYColasTests;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pilasYColas.PilaEstatica;

public class PilaEstaticaTest {
	
	public PilaEstatica pila;
	
	@Before
	public void SetUp() {
		pila = new PilaEstatica();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void CreaPila() {
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	
	public void InsertaElemento() {
		
	}
	
}
