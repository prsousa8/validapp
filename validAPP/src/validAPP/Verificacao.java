package validAPP;

public class Verificacao{
	//ATRIBUTOS
	public Validacao validacao;
	
	//METODO CONSTRUTOR
	public Verificacao() {
		this.validacao = new Validacao();
	}
	
	//METODOS
	public void verificar_e_printar_lotes(Estoque E) {
		E.ordenarEstoque(E.lotes);
		this.validacao.mostrarValidacao(E.lotes);
	}
	
}
