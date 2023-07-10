package validAPP;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings({ "deprecation", "serial" })
public class Notificacao extends JFrame implements Observer{
	//ATRIBUTOS
	public int id;
	public Loja loja;
	
	//M�TODO CONSTRUTOR
	public Notificacao (int id) {
		this.id = id;
		setVisible(true);
		setSize(266,500);
		setTitle("validAPP");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	
	//METODOS
	public void criarBotaoAmarelo(int cont, Lote lote, Loja loja) {
		JButton Amarelo = new JButton();
		Amarelo.setBounds(0,cont,250,30);
		Amarelo.setFont(new Font("Arial", Font.BOLD, 15));
		Amarelo.setBackground(new Color(255,250,205));
		Amarelo.addActionListener(action->{this.teste(lote, loja);});
		add(Amarelo);
		Amarelo.setText(lote.produtos.get(0).nome);
	}
	
	public void criarBotaoVerde(int cont, Lote lote, Loja loja) {
		JButton Verde = new JButton();
		Verde.setBounds(0,cont,250,30);
		Verde.setFont(new Font("Arial", Font.BOLD, 15));
		Verde.setBackground(new Color(152,251,152));
		Verde.addActionListener(action->{this.teste(lote, loja);});
		add(Verde);
		Verde.setText(lote.produtos.get(0).nome);
	}
	
	public void criarBotaoVermelho(int cont, Lote lote, Loja loja) {
		JButton Vermelho = new JButton();
		Vermelho.setBounds(0,cont,250,30);
		Vermelho.setFont(new Font("Arial", Font.BOLD, 15));
		Vermelho.setBackground(new Color(216,191,216));
		Vermelho.addActionListener(action->{this.teste(lote, loja);});
		add(Vermelho);
		Vermelho.setText(lote.produtos.get(0).nome);
	}

	public void gerarInterfaceGrafica(Loja loja) {
		this.loja = loja;
		Verificacao V = new Verificacao();
		V.verificar_e_printar_lotes(loja.getEstoque());
		
		int cont = 0;
		for(Lote lote : V.validacao.Vermelho) {
			criarBotaoVermelho(cont, lote, loja);
			cont = cont +30;
		}
		for(Lote lote : V.validacao.Amarelo) {
			criarBotaoAmarelo(cont, lote, loja);
			cont = cont +30;
		}
		for(Lote lote : V.validacao.Verde) {
			criarBotaoVerde(cont, lote, loja);
			cont = cont +30;
		}
		
	}
	
	private void teste(Lote lote, Loja loja) {
		if(lote.diasRestantes > 0) {
			JOptionPane.showMessageDialog(null, "Validade: "+lote.validade +
					"\nNúmero do lote: " + lote.numero +
					"\nLocalidade: " + lote.localidade +
					"\nQuantidade de produtos: " + lote.qtdProdutos + 
					"\n" + lote.diasRestantes + " dias restantes"
					, lote.produtos.get(1).nome, JOptionPane.INFORMATION_MESSAGE 
					);
		}else if(lote.diasRestantes <= 0){
			JOptionPane.showMessageDialog(null, "Validade: "+lote.validade +
					"\nNúmero do lote: " + lote.numero +
					"\nLocalidade: " + lote.localidade +
					"\nQuantidade de produtos: " + lote.qtdProdutos + 
					"\nVencido a " + lote.diasRestantes*(-1) + " dias"
					, lote.produtos.get(1).nome, JOptionPane.CANCEL_OPTION 
					);
			if (JOptionPane.showConfirmDialog(null, "Deseja remover estoque?", lote.produtos.get(1).nome, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				this.dispose(); 
				loja.getEstoque().removerLote(lote);
			}
			
		}
		
	}
	
	public void Notificar(Loja loja) { 
		if(this.id == 0) {
			gerarInterfaceGrafica(loja);
		}else {
			this.loja = loja;
			Notificacao N = new Notificacao(this.id);
			N.gerarInterfaceGrafica(loja);
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		String acao = String.valueOf(arg1);
		
		if(acao.equals("LoteRemovido")) {
			this.id++;
			this.Notificar(this.loja);
		}
		
	}
	
}
