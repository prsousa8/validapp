package validAPP;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import validAPP.Estoque;

public class EstoqueTest {
	Estoque E = new Estoque();
	
	@Test
	public void testRemoveLote() {
		E.criar_e_adicionar_lote_ao_estoque("Arroz", 3.50, "Cereal", 3, "03/05/2003", "12345", "Setor 1");
		E.criar_e_adicionar_lote_ao_estoque("Tomate", 2.30, "Fruta", 4, "03/09/2100", "23456", "Setor 23");
		E.removerLote(E.lotes.get(1));
		assertEquals(E.lotes.size(),1);
		assertEquals(E.lotes.get(0).qtdProdutos,3);
		E.removerLote(E.lotes.get(0));
		assertEquals(E.lotes.size(),0);
	}
	@Test
	public void testImprimir() {
		E.criar_e_adicionar_lote_ao_estoque("Arroz", 3.50, "Cereal", 3, "03/05/2003", "12345", "Setor 1");
		E.criar_e_adicionar_lote_ao_estoque("Tomate", 2.30, "Fruta", 4, "03/09/2100", "23456", "Setor 23");
		E.imprimir();
	}
	@Test
	public void testOrdenarEstoque() {
		E.criar_e_adicionar_lote_ao_estoque("Arroz", 3.50, "Cereal", 3, "03/05/2003", "12345", "Setor 1");
		E.criar_e_adicionar_lote_ao_estoque("Tomate", 2.30, "Fruta", 4, "03/09/2100", "23456", "Setor 23");
		E.ordenarEstoque(E.lotes);
	}

}
