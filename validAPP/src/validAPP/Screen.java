package validAPP;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Screen extends JFrame{
	
	public Screen () {
		setVisible(true);
		setSize(266,500);
		setTitle("validAPP");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	
	public void criarBotaoAmarelo(int cont, Lote lote) {
		JButton Amarelo = new JButton();
		Amarelo.setBounds(0,cont,250,30);
		Amarelo.setFont(new Font("Arial", Font.BOLD, 15));
		Amarelo.setBackground(new Color(255,250,205));
		Amarelo.addActionListener(action->{this.teste(lote);});
		add(Amarelo);
		Amarelo.setText(lote.produtos.get(0).nome);
	}
	public void criarBotaoVerde(int cont, Lote lote) {
		JButton Verde = new JButton();
		Verde.setBounds(0,cont,250,30);
		Verde.setFont(new Font("Arial", Font.BOLD, 15));
		Verde.setBackground(new Color(152,251,152));
		Verde.addActionListener(action->{this.teste(lote);});
		add(Verde);
		Verde.setText(lote.produtos.get(0).nome);
	}
	public void criarBotaoVermelho(int cont, Lote lote) {
		JButton Vermelho = new JButton();
		Vermelho.setBounds(0,cont,250,30);
		Vermelho.setFont(new Font("Arial", Font.BOLD, 15));
		Vermelho.setBackground(new Color(216,191,216));
		Vermelho.addActionListener(action->{this.teste(lote);});
		add(Vermelho);
		Vermelho.setText(lote.produtos.get(0).nome);
	}

	public void gerarInterfaceGrafica(ArrayList<Lote> lotes) {
		Semaforo Semaforo = new Semaforo();
		Semaforo.verificarValidade(lotes);
		int cont = 0;
		for(Lote lote : Semaforo.Vermelho) {
			criarBotaoVermelho(cont, lote);
			cont = cont +30;
		}
		for(Lote lote : Semaforo.Amarelo) {
			criarBotaoAmarelo(cont, lote);
			cont = cont +30;
		}
		for(Lote lote : Semaforo.Verde) {
			criarBotaoVerde(cont, lote);
			cont = cont +30;
		}
		
	}
	
	private void teste(Lote lote) {
		JOptionPane.showMessageDialog(null, "Validade: "+lote.validade +
				"\nNúmero do lote: " + lote.numero +
				"\nLocalidade: " + lote.localidade +
				"\nQuantidade de produtos: " + lote.qtdProdutos
				, lote.produtos.get(1).nome, JOptionPane.INFORMATION_MESSAGE
				);
	}

}
