package validAPP;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import validAPP.Lote;
import validAPP.Produto;

public class LoteProdutoTest {
	
	Produto produto1 = new Produto("Produto 1", 0, null);
	Produto produto2 = new Produto("Produto 2", 0, null);
	Produto produto3 = new Produto("Produto 3", 0, null);
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testConstrutor() {
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		Lote lote1 = new Lote(produtos, "01/01/2024", "Lote1", "Local1", 3);
		assertEquals(3, lote1.qtdProdutos);
		assertEquals("Lote1", lote1.numero);
		assertEquals("01/01/2024", lote1.validade);
		assertEquals("Local1", lote1.localidade);
		assertEquals(3, lote1.produtos.size());
		assertEquals(174, lote1.diasRestantes);
	}
	
	@Test
	public void testcompareTo() {
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		Lote lote1 = new Lote(produtos, "01/01/2024", "Lote1", "Local1", 3);
		Lote lote2 = new Lote(produtos, "01/01/2023", "Lote2", "Local2", 3);
		
		assertEquals(1, lote1.compareTo(lote2));
		assertEquals(-1, lote2.compareTo(lote1));
		assertEquals(0, lote1.compareTo(lote1));
	}

}
