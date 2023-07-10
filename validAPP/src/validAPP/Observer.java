package validAPP;

public class Observer {
	//ATRIBUTOS
	protected Notificacao notificacao;
	protected Loja loja;
	protected int id = 0;
	protected AdapterInstancia lojaInstanciaAdapter;
	
	//M�TODO CONSTRUTOR
	public Observer() {
		
	}
	
	//METODOS
	public void setState(Loja loja) {
		lojaInstanciaAdapter.instanciarClasse();
		
		this.id = id + 1;
		notifyObservers();
	}
	
	private void notifyObservers() {
		notificacao.Notificar(loja);
	}
	
}
