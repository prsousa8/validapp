package validAPP;

import java.util.ArrayList;
import java.util.Collections;

public class Estoque {
	//ATRIBUTOS
	public ArrayList<Lote> lotes;
	
	//M�TODO CONSTRUTOR
	public Estoque() {
		lotes = new ArrayList<Lote>();
	}
	
	//MÉTODOS
	
	public void adicionarLote(Lote lote) {
		lotes.add(lote);
	}
	
	public void imprimir() {
		System.out.println("Lotes disponíveis:");
		for (Lote lote : lotes) {
			System.out.println(" - " + lote.numero + " (quantidade de produtos: " + lote.qtdProdutos+ ")");
		}
	}
	
	public void ordenarEstoque(ArrayList<Lote> lotes) {
		Collections.sort(lotes);
	}
	
	public void criar_e_adicionar_lote_ao_estoque(String nomeProduto, double precoProduto, String categoria, int qtdProdutos, String validade, String numeroLote, String localidade) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		for(int i = 0; i<qtdProdutos; i++) {
			produtos.add(new Produto(nomeProduto, precoProduto, categoria));
		}
		
		Lote L = new Lote(produtos, validade, numeroLote, localidade, qtdProdutos);
		this.adicionarLote(L);
	}
	
}
