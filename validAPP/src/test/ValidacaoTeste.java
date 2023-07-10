package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import validAPP.Lote;
import validAPP.Produto;
import validAPP.Validacao;

public class ValidacaoTeste {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testValidacao() {
		Produto produto = new Produto("Nome", 10, "categoria");
		
	    Lote lote1 = new Lote(null, "10/10/2022", null, null, 10);
	    lote1.diasRestantes=10;
	    Lote lote2 = new Lote(null, "20/10/2022", null, null, 20);
	    lote2.diasRestantes=30;
	    Lote lote3 = new Lote(null, "05/07/2022", null, null, 5);
	    lote3.diasRestantes=-5;
	     
	    
	    ArrayList<Lote> lotes = new ArrayList<>();
	    lotes.add(lote1);
	    lotes.add(lote2);
	    lotes.add(lote3);

	    Validacao validacao = new Validacao();
	    validacao.verificarValidade(lotes); 
    
	    // Verificar se os lotes foram classificados corretamente
	    assertEquals(1, validacao.Verde.size());
	    assertEquals(1, validacao.Amarelo.size());
	    assertEquals(1, validacao.Vermelho.size());
	}


}
