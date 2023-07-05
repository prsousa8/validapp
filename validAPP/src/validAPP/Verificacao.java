package validAPP;

public class Verificacao{
	
	public Semaforo S;
	
	public Verificacao() {
		this.S = new Semaforo();
	}
	
	public void verificar_e_printar_lotes(Estoque E) {
		E.ordenarEstoque(E.lotes);
		this.S.mostrarSemaforo(E.lotes);
	}
	
}
