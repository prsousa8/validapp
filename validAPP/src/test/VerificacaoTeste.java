package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import validAPP.Estoque;
import validAPP.Verificacao;

public class VerificacaoTeste {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testVerificarEPrintarLotes() {
		Estoque Estoque1 = new Estoque();
		
		Estoque1.criar_e_adicionar_lote_ao_estoque("limao", 15.50, "frutas", 7, "10/10/2022", "C0D09", "setor 10");
		
		Verificacao verificacao = new Verificacao();
		
		verificacao.verificar_e_printar_lotes(Estoque1);
		
		assertEquals(1, Estoque1.lotes.size());
	}

}
