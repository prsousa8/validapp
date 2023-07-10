package validAPP;
    
// set loja set estoque
public class AdapterSetter implements SetterInterface{
    private Loja loja;
    private Observer observer;
    private Estoque estoque;
    
    public AdapterSetter(Loja loja){
        this.loja = loja;
    }
    
    public AdapterSetter(Observer observer){
        this.observer = observer;
    }
    
    public AdapterSetter(Estoque estoque){
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
