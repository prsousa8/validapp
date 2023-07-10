package validAPP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

public class Estoque extends Observable{
	//ATRIBUTOS
	public ArrayList<Lote> lotes;
	private String acao = "";
	
	//METODO CONSTRUTOR
	public Estoque() {
		this.lotes = new ArrayList<Lote>();
	}
	
	//MÉTODOS
	public void adicionarLote(Lote lote) {
		lotes.add(lote);
	}
	
	public void removerLote(Lote lote) {
		acao = "LoteRemovido";
		lotes.remove(lote);
		this.mudaEstado();
	}
	
	private void mudaEstado() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers(acao);
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
		
		Lote lote = new Lote(produtos, validade, numeroLote, localidade, qtdProdutos);
		this.adicionarLote(lote);
	}
	
}
