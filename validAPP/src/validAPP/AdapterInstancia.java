package validAPP;
    
// set loja set estoque
public class AdapterInstancia implements InstanciaInterface{
    private Loja loja;
    private Observer observer;
    private Estoque estoque;
    
    public AdapterInstancia(Loja loja){
        this.loja = loja;
    }
    
    public AdapterInstancia(Observer observer){
        this.observer = observer;
    }
    
    public AdapterInstancia(Estoque estoque){
        this.estoque = estoque;
    }
    
    /** ADAPTER PARA SETSTATE EM OBSERVER e PARA SETESTOQUE EM LOJA **/
    @Override
    public void instanciarClasse() {
        if(loja != null){
            loja.setEstoque(estoque);
        }
        
        if(observer != null){
           observer.setState(loja);
        }
        
    }
    
}
