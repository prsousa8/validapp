package validAPP;

import java.util.ArrayList;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		Estoque E = new Estoque();
			
		E.criar_e_adicionar_lote_ao_estoque("limao", 15.50, "frutas", 7, "10/10/2022", "C0D09", "setor 10");
		E.criar_e_adicionar_lote_ao_estoque("uva", 15.50, "frutas", 5, "10/10/2024", "C0D010", "setor 10");
		E.criar_e_adicionar_lote_ao_estoque("maca", 5.00, "frutas", 5, "10/07/2023", "C0D011", "setor 10");
		
		Loja L = new Loja("000222333", E); 
		
		Verificacao V = new Verificacao();
		E.imprimir();
		V.verificar_e_printar_lotes(E);
		
		
		//interface gráfica
		Notificacao N = new Notificacao();
		N.gerarInterfaceGrafica(E.lotes);
		
	}
}
