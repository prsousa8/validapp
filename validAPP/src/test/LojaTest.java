package test;

import static org.junit.Assert.*;

import org.junit.Test;

import validAPP.Loja;

public class LojaTest {
	Loja L;
	@Test
	public void testGetLoja() {
		L = Loja.getLoja();
		L = Loja.getLoja();
		assertEquals(7,L.getEstoque().lotes.get(0).qtdProdutos);
		assertEquals("limao",L.getEstoque().lotes.get(0).produtos.get(0).nome);
	}
	@Test
	public void testGetCNPJ() {
		L = Loja.getLoja();
		assertEquals("00220000", L.getCnpj());
	}

}
