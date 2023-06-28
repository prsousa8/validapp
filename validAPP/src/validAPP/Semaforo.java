package validAPP;

import java.util.ArrayList;

public class Semaforo {

	public ArrayList <Lote> Verde;
	public ArrayList <Lote> Amarelo;
	public ArrayList <Lote> Vermelho;
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	public Semaforo() {
		Verde = new ArrayList <Lote>();
		Amarelo = new ArrayList <Lote>();
		Vermelho = new ArrayList <Lote>();
	}
	
	public void verificarValidade(ArrayList<Lote> estoque) {
		
		for(Lote lote : estoque) {
			long quant = lote.quantDeDiasRestantes(lote.validade);
			if(quant < 0) { //vermelho
				this.Vermelho.add(lote);
			}else if(quant < 30){ //amarelo
				this.Amarelo.add(lote);
			}else if(quant > 30){ //verde
				this.Verde.add(lote);
			}
		}
		
	}
	
	public void imprimirVerde() {
		System.out.println("------------------------------------------------");
		System.out.println(ANSI_GREEN + " Lotes com validade adequada: " + ANSI_RESET);
		for (Lote lote : Verde) {
			System.out.println(" - " + lote.nome + " (" + lote.validade + ")");
		}
	}
	
	public void imprimirAmarelo() {
		System.out.println("------------------------------------------------");
		System.out.println(ANSI_YELLOW + " Lotes com menos de 1 mês de validade: " + ANSI_RESET);
		for (Lote lote : Amarelo) {
			System.out.println(" - " + lote.nome + " (" + lote.validade + ")");
		}
	}
	
	public void imprimirVermelho() {
		System.out.println("------------------------------------------------");
		System.out.println(ANSI_RED + " Lotes vencidos: " + ANSI_RESET);
		for (Lote lote : Vermelho) {
			System.out.println(" - " + lote.nome + " (" + lote.validade + ")");
		}
	}
	
}
