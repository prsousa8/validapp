package validAPP;

import java.util.ArrayList;

public class Validacao {
	//ATRIBUTOS
	public ArrayList <Lote> Verde;
	public ArrayList <Lote> Amarelo;
	public ArrayList <Lote> Vermelho;
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	//METODO CONSTRUTOR
	public Validacao() {
		Verde = new ArrayList <Lote>();
		Amarelo = new ArrayList <Lote>();
		Vermelho = new ArrayList <Lote>();
	}
	
	//METODOS	
	public void verificarValidade(ArrayList<Lote> lotes) {
		
		for(Lote lote : lotes) {
			if(lote.diasRestantes < 0) { //vermelho
				this.Vermelho.add(lote);
			}else if(lote.diasRestantes < 30){ //amarelo
				this.Amarelo.add(lote);
			}else if(lote.diasRestantes >= 30){ //verde
				this.Verde.add(lote);
			}
		}
		
	}
	
	public void imprimirVerde() {
		System.out.println("------------------------------------------------");
		System.out.println(ANSI_GREEN + " Lotes com validade adequada: " + ANSI_RESET);
		for (Lote lote : Verde) {
			long quant = lote.diasRestantes;
			System.out.println(" - " + lote.produtos.get(0).nome + " (" + lote.validade + " - " + quant + " dias restantes)");
		}
	}
	
	public void imprimirAmarelo() {
		System.out.println("------------------------------------------------");
		System.out.println(ANSI_YELLOW + " Lotes com menos de 1 mês de validade: " + ANSI_RESET);
		for (Lote lote : Amarelo) {
			long quant = lote.diasRestantes;
			System.out.println(" - " + lote.produtos.get(0).nome + " (" + lote.validade + " - " + quant + " dias restantes)");
		}
	}
	
	public void imprimirVermelho() {
		System.out.println("------------------------------------------------");
		System.out.println(ANSI_RED + " Lotes vencidos: " + ANSI_RESET);
		for (Lote lote : Vermelho) {
			long quant = lote.diasRestantes;
			System.out.println(" - " + lote.produtos.get(0).nome + " (" + lote.validade + " - vencido a " + quant*(-1) + " dias)");
		}
	}
	
	public void mostrarValidacao(ArrayList<Lote> lotes) {
		verificarValidade(lotes);
		imprimirVerde();
		imprimirAmarelo();
		imprimirVermelho();
	}
	
}
