import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
 
	@Test
	 public void llenar() {
		 
		DepositoCombustible grande= new DepositoCombustible(200,100);
			
		    grande.fill(100);
			assertEquals(200, grande.getDepositoNivel(), 0.001);
			
		DepositoCombustible pequeño= new DepositoCombustible(200,100);
				
			pequeño.fill(10);
			assertEquals(110, pequeño.getDepositoNivel(), 0.001);
			
	    DepositoCombustible negativo= new DepositoCombustible(200,100);
			
			negativo.fill(-10);
			assertEquals(90, negativo.getDepositoNivel(), 0.001);	
	 }
	 
	 @Test
	 public void consumir() {
		 
		DepositoCombustible grande= new DepositoCombustible(200,100);
			
			grande.consumir(100);
			assertEquals(0, grande.getDepositoNivel(), 0.001);
			
		DepositoCombustible pequeño= new DepositoCombustible(200,100);
				
			pequeño.consumir(10);
			assertEquals(90, pequeño.getDepositoNivel(), 0.001);
			
	    DepositoCombustible negativo= new DepositoCombustible(200,100);
			
			negativo.consumir(-10);
			assertEquals(110, negativo.getDepositoNivel(), 0.001);
	 }
	 
	 
	 @Test
	 public void depositolleno() {
		 
		DepositoCombustible n= new DepositoCombustible(10,5);
			
		assertFalse(n.estaLleno());
				
	 }
	 
	 @Test
	 public void depositovacio() {
		 
		DepositoCombustible n= new DepositoCombustible(10,0);
		
		assertTrue(n.estaVacio());
			
	 }
	  
	@Test
	public void limitemaximo() {
		
		DepositoCombustible n= new DepositoCombustible(10,5);
		
		assertEquals(10, n.getDepositoMax(), 0.001);
		
	}

	@Test
	public void nivelactual() {
		
		DepositoCombustible n= new DepositoCombustible(10,5);
		
		assertEquals(5, n.getDepositoNivel(), 0.001);
		
	}
	

	
}




















