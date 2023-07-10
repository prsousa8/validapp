package validAPP;

public class Observer {
	//ATRIBUTOS
	protected Notificacao notificacao;
	protected Loja loja;
	protected int id = 0;
	protected AdapterSetter adapterSetter;
	
	//M�TODO CONSTRUTOR
	public Observer() {
		
	}
	
	//METODOS
	public void setState() {
		adapterSetter.instanciarClasse();
		
		this.id = id + 1;
		notifyObservers();
	}
	
	private void notifyObservers() {
		notificacao.notificar(loja);
	}
	
	public void setState(Loja loja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
