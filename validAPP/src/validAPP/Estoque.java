package validAPP;

import java.util.ArrayList;

public class Estoque {
	
	public ArrayList <Lote> estoque;
	
	public Estoque() {
		estoque = new ArrayList <Lote>();
	}
	
	public void adicionarLote(Lote lote) {
		estoque.add(lote);
	}
	
	public void imprimir() {
		System.out.println(" Produtos disponíveis:");
		for (Lote lote : estoque) {
			System.out.println(" - " + lote.nome + " (quantidade:" + lote.quantidade+ ")");
		}
	}
	
}
