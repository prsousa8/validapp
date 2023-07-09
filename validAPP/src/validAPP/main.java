package validAPP;

public class main {
	public static void main(String[] args) {		
		Loja loja = Loja.getLoja();
		
		Verificacao verificacao = new Verificacao();
		loja.getEstoque().imprimir();
		verificacao.verificar_e_printar_lotes(loja.getEstoque());
		
		//Interface Gráfica
		Notificacao notificacao = new Notificacao();
		notificacao.gerarInterfaceGrafica(loja.getEstoque().lotes);
	}
}
