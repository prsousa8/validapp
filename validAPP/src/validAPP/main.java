package validAPP;

public class main {
	public static void main(String[] args) {	
		Loja loja = Loja.getLoja();
		
		loja.getEstoque().imprimir();
		
		//Interface Gráfica
		Notificacao notificacao = new Notificacao(0);
		notificacao.notificar(loja);
		loja.getEstoque().addObserver(notificacao); //Notificação observa o estoque
	}
}
