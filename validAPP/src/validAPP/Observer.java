package validAPP;

public class Observer {
	//ATRIBUTOS
	protected Notificacao notificacao;
	protected Loja loja;
	protected int id = 0;
	protected AdapterSetter lojaAdapterSetter;
	
	//M�TODO CONSTRUTOR
	public Observer() {
		
	}
	
	//METODOS
	public void setState() {
		lojaAdapterSetter.instanciarClasse();
		
		this.id = id + 1;
		notifyObservers();
	}
	
	private void notifyObservers() {
		notificacao.Notificar(loja);
	}
	
	public void setState(Loja loja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
