package validAPP;

public class main {
	public static void main(String[] args) {	
		
		Loja loja = Loja.getLoja();
		
		loja.getEstoque().imprimir();
		
		//Interface Gráfica
		Notificacao N = new Notificacao(0);
		N.Notificar(loja);
		loja.getEstoque().addObserver(N); //Notificação observa o estoque
	}
}
