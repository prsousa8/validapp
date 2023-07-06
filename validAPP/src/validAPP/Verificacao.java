package validAPP;

public class Verificacao{
	
	public Validacao validacao;
	
	public Verificacao() {
		this.validacao = new Validacao();
	}
	
	public void verificar_e_printar_lotes(Estoque E) {
		E.ordenarEstoque(E.lotes);
		this.validacao.mostrarValidacao(E.lotes);
	}
	
}
