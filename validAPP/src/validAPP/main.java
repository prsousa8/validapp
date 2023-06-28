package validAPP;

public class main {

	public static void main(String[] args) {
		
		Estoque E = new Estoque();
		Semaforo S = new Semaforo();
		
		Lote L1 = new Lote("arroz", "29/06/2023", "setor 1", 100);
		E.adicionarLote(L1);
		Lote L2 = new Lote("feijão", "30/07/2023", "setor 1", 200);
		E.adicionarLote(L2);
		Lote L3 = new Lote("macarão", "01/11/2023", "setor 1", 300);
		E.adicionarLote(L3);
		Lote L4 = new Lote("batata", "07/07/2024", "setor 2", 400);
		E.adicionarLote(L4);
		Lote L5 = new Lote("refrigerante", "07/07/2015", "setor 8", 400);
		E.adicionarLote(L5);
		Lote L6 = new Lote("bicoito", "07/07/2014", "setor 8", 400);
		E.adicionarLote(L6);
		Lote L7 = new Lote("rosquinha", "07/07/2023", "setor 8", 400);
		E.adicionarLote(L7);
		
		E.imprimir();
		
		S.verificarValidade(E.estoque);
		S.imprimirVerde();
		S.imprimirAmarelo();
		S.imprimirVermelho();
		
	}
}
