package validAPP;

import java.util.ArrayList;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		Estoque E = new Estoque();
		ArrayList<Produto> LP1 = new ArrayList<Produto>();
		ArrayList<Produto> LP2 = new ArrayList<Produto>();
		ArrayList<Produto> LP3 = new ArrayList<Produto>();
		ArrayList<Produto> LP4 = new ArrayList<Produto>();
		ArrayList<Produto> LP5 = new ArrayList<Produto>();
		ArrayList<Produto> LP6 = new ArrayList<Produto>();
		ArrayList<Produto> LP7 = new ArrayList<Produto>();
		ArrayList<Produto> LP8 = new ArrayList<Produto>();
		
		LP1.add(new Produto("arroz", 5.50, "alimento"));
		LP1.add(new Produto("arroz", 5.50, "alimento"));
		Lote L1 = new Lote(LP1, "29/06/2023", "COD01", "setor 1", LP1.size());
		E.adicionarLote(L1);
		
		LP2.add(new Produto("feijao", 9.50, "alimento"));
		LP2.add(new Produto("feijao", 9.50, "alimento"));
		Lote L2 = new Lote(LP2, "30/07/2023", "COD02", "setor 1", LP2.size());
		E.adicionarLote(L2);
		
		LP3.add(new Produto("macarrão", 3.00, "alimento"));
		LP3.add(new Produto("macarrão", 3.00, "alimento"));
		Lote L3 = new Lote(LP3, "01/11/2023", "COD03", "setor 1", LP3.size());
		E.adicionarLote(L3);
		
		LP4.add(new Produto("batata", 4.00, "legume"));
		LP4.add(new Produto("batata", 4.00, "legume"));
		Lote L4 = new Lote(LP4, "07/07/2024", "COD04", "setor 2", LP4.size());
		E.adicionarLote(L4);
		
		LP5.add(new Produto("refrigerante", 3.50, "bebida"));
		LP5.add(new Produto("refrigerante", 3.50, "bebida"));
		Lote L5 = new Lote(LP5, "07/07/2015", "COD05", "setor 8", LP5.size());
		E.adicionarLote(L5);
		
		LP6.add(new Produto("biscoito", 2.50, "massas"));
		LP6.add(new Produto("biscoito", 2.50, "massas"));
		Lote L6 = new Lote(LP6, "07/07/2014", "COD06", "setor 3", LP6.size());
		E.adicionarLote(L6);
		
		LP7.add(new Produto("rosquinha", 1.50, "massas"));
		LP7.add(new Produto("rosquinha", 1.50, "massas"));
		Lote L7 = new Lote(LP7, "07/07/2023", "COD07", "setor 3", LP7.size());
		E.adicionarLote(L7);
		
		LP8.add(new Produto("abacaxi", 1.50, "frutas"));
		LP8.add(new Produto("abacaxi", 1.50, "frutas"));
		LP8.add(new Produto("abacaxi", 1.50, "frutas"));
		Lote L8 = new Lote(LP8, "07/08/2023", "COD08", "setor 3", LP8.size());
		E.adicionarLote(L8);
		
		E.criar_e_adicionar_lote_ao_estoque("limao", 15.50, "frutas", 7, "10/10/2010", "C0D09", "setor 10");
		E.criar_e_adicionar_lote_ao_estoque("uva", 15.50, "frutas", 5, "10/10/2024", "C0D010", "setor 10");
		E.criar_e_adicionar_lote_ao_estoque("maca", 5.00, "frutas", 5, "10/07/2023", "C0D011", "setor 10");
		
		Verificacao V = new Verificacao();
		E.imprimir();
		V.verificar_e_printar_lotes(E);
		
		
		//interface gráfica
		Screen S = new Screen();
		S.gerarInterfaceGrafica(E.lotes);
		
	}
}
